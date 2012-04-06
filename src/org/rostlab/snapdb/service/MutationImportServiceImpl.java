package org.rostlab.snapdb.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.rostlab.snapdb.dom.Mutation;
import org.rostlab.snapdb.util.ExtentionFilenameFilter;

public class MutationImportServiceImpl implements MutationImportService {

	@Override
	public void importMutation(File pathToDir) {
		if (pathToDir.exists() == false || pathToDir.isDirectory() == false) {
			new IllegalArgumentException(
					"File dosn«t exist or is not a Directory");
		} else {
			for (File dir : pathToDir.listFiles()) {
				for (File file : dir.listFiles(new ExtentionFilenameFilter(
						new String[] { "snap2", "fasta" }))) {
					parseMutationFile(file);
				}
			}
		}
	}

	private void parseMutationFile(File file) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			Mutation mutation = new Mutation();
			while ((line = reader.readLine()) != null) {
				char mut=line.charAt(line.length()-1);
				int pos = Integer.parseInt(line.substring(1,line.length()-1));
			}
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

	}

}
