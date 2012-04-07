package org.rostlab.snapdb.service;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;

import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.biojava3.core.sequence.ProteinSequence;
import org.biojava3.core.sequence.io.FastaReaderHelper;
import org.rostlab.snapdb.dao.MutationDao;
import org.rostlab.snapdb.dao.SequenceDao;
import org.rostlab.snapdb.dom.Mutation;
import org.rostlab.snapdb.dom.MutationType;
import org.rostlab.snapdb.dom.Sequence;
import org.rostlab.snapdb.util.AminoLookup;
import org.rostlab.snapdb.util.ExtentionFilenameFilter;

public class MutationImportServiceImpl implements MutationImportService {
	private MutationDao mutationDao;
	private SequenceDao sequenceDao;

	@Override
	public void importMutation(File pathToDir) {
		if (pathToDir.exists() == false || pathToDir.isDirectory() == false) {
			new IllegalArgumentException(
					"File dosn�t exist or is not a Directory");
		} else {
			for (File file : pathToDir.listFiles(new ExtentionFilenameFilter(
					new String[] { "tar.gz", "tar" }))) {
				// read fasta
				String archiveName = FilenameUtils.removeExtension(file
						.getName());
				archiveName = FilenameUtils.removeExtension(archiveName);
				final File pathToFasta = new File(pathToDir.getAbsoluteFile(),
						"/fasta/" + archiveName + ".fasta");
				if (pathToFasta.exists() == false) {
					System.err.println("File dosn�t exist: "
							+ pathToFasta.getAbsolutePath());
				}
				final Sequence sequence = parseFastaFile(pathToFasta);
				// read mutation
				InputStream fileIn = null;
				TarArchiveInputStream tarFileIn = null;

				try {
					fileIn = new FileInputStream(file);
					tarFileIn = new TarArchiveInputStream(
							new GzipCompressorInputStream(fileIn));
					TarArchiveEntry entry = null;
					while ((entry = tarFileIn.getNextTarEntry()) != null) {
						if (entry.getName().endsWith(".snap2")) {
							parseSnapMutationFile(
									unpackEntry(entry, new File(pathToDir,
											sequence.getRefId() + ".snap2"),
											tarFileIn), sequence);
						}
						if (entry.getName().endsWith(".SIFTprediction")) {
							;
							// parseSnapMutationFile(unpackEntry(entry,new
							// File(pathToDir,sequence.getRefId()+".SIFTprediction"),tarFileIn));
						}
					}
				} catch (FileNotFoundException e) {
					throw new RuntimeException(e);
				} catch (IOException e) {
					throw new RuntimeException(e);
				} finally {
					try {
						tarFileIn.close();
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				}
			}
		}
	}

	private File unpackEntry(TarArchiveEntry entry, final File outputFile,
			final TarArchiveInputStream tarFileIn) {

		BufferedOutputStream outputStream;
		try {
			outputStream = new BufferedOutputStream(new FileOutputStream(
					outputFile));

			byte[] content = new byte[(int) entry.getSize()];

			tarFileIn.read(content);

			if (content.length > 0) {
				IOUtils.copy(new ByteArrayInputStream(content), outputStream);
				IOUtils.closeQuietly(outputStream);
				return outputFile;
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return null;
	}

	private Sequence parseFastaFile(File pathToFasta) {
		LinkedHashMap<String, ProteinSequence> a;
		final Sequence sequence = new Sequence();
		try {
			a = FastaReaderHelper.readFastaProteinSequence(pathToFasta);
			// FastaReaderHelper.readFastaDNASequence for DNA sequences
			String header = null;
			for (Entry<String, ProteinSequence> entry : a.entrySet()) {
				if (header == null
						|| entry.getValue().getOriginalHeader()
								.contains(header) == false) {
					header = entry.getValue().getOriginalHeader().split("\\.")[0];
					final String refId = header.split("\\|")[3];
					if (refId == null)
						throw new RuntimeException("no refid found");
					sequence.setRefId(refId);
					sequence.setSequence(entry.getValue().getSequenceAsString());
				}
			}
			sequenceDao.create(sequence);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return sequence;
	}

	private void parseSnapMutationFile(File file, Sequence sequence) {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(file));
			String line = null;
			Mutation mutation = null;
			int currPos = 0;
			while ((line = reader.readLine()) != null) {
				final String[] lineArray = line.split("\\t");
				final String orgPosMut = lineArray[0];
				final String effectStr = lineArray[1];

				final int pos = Integer.parseInt(orgPosMut.substring(1,
						orgPosMut.length() - 1));
				final char org = orgPosMut.charAt(0);
				if (pos != currPos) {
					currPos = pos;
					if(mutation!=null)
						mutationDao.create(mutation);
					mutation = new Mutation();
					mutation.setLsequenceid(sequence.getId());
					mutation.setPos(currPos);
					mutation.setType(MutationType.SNAP);
					mutation.getMutReliability()[AminoLookup.lookupAAtoIndex(org)] = 100;
					mutation.getMutEffect()[AminoLookup.lookupAAtoIndex(org)] = false;
				}
				final char mut = orgPosMut.charAt(orgPosMut.length() - 1);
				final Boolean effect = effectStr.equals("Non-neutral");
				final Integer accuracy = Integer.parseInt(lineArray[3]
						.substring(0, lineArray[3].length() - 1));
				mutation.getMutReliability()[AminoLookup.lookupAAtoIndex(mut)] = accuracy;
				mutation.getMutEffect()[AminoLookup.lookupAAtoIndex(mut)] = effect;
			}
			mutationDao.create(mutation);

		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			try {
				reader.close();
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}

	}

	public MutationDao getMutationDao() {
		return mutationDao;
	}

	public void setMutationDao(MutationDao mutationDao) {
		this.mutationDao = mutationDao;
	}

	public SequenceDao getSequenceDao() {
		return sequenceDao;
	}

	public void setSequenceDao(SequenceDao sequenceDao) {
		this.sequenceDao = sequenceDao;
	}

}
