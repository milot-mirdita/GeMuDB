package org.rostlab.gemudb.service;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.rostlab.gemudb.dao.SequenceDao;
import org.rostlab.gemudb.dom.Sequence;
import org.rostlab.gemudb.service.model.ProteinId;
import org.rostlab.gemudb.util.BlankRemover;

import uk.ac.ebi.demo.picr.business.PICRClient;
import uk.ac.ebi.demo.picr.soap.CrossReference;
import uk.ac.ebi.demo.picr.soap.UPEntry;

public class SearchProteinServiceImpl implements SearchProteinService {
	private SequenceDao sequenceDao;
	private PICRClient client = new PICRClient();
	private java.util.List<String> databases;

	public SearchProteinServiceImpl() {
		// databases = client.loadDatabases();
		databases = new ArrayList<String>();
		databases.add("REFSEQ");
	}

	@Override
	public ProteinId searchProtein(String searchString) {
		searchString = BlankRemover.trim(searchString);
		Pattern pattern = Pattern.compile("^(A|R|N|D|C|E|Q|G|H|I|L|K|M|F|P|S|T|X|Y|V|X)+$", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(searchString);
		
		List<UPEntry> entries;		
		if (matcher.matches()) { // AA
			searchString = "> SEQ \n" + searchString.toUpperCase();
			entries = client.performSequenceMapping(searchString,
					databases.toArray());

		} else { // ID
			Sequence tmpSeq = sequenceDao.selectByRefId(searchString);
			if (tmpSeq != null)
				return new ProteinId(tmpSeq.getRefId());
			entries = client.performAccessionMapping(searchString,
					databases.toArray());

		}
		
		if (entries != null && entries.size() > 0) {
			for (UPEntry entry : entries) {
				for (CrossReference xref : entry.getIdenticalCrossReferences()) {
					Sequence seq = sequenceDao.selectByRefId(xref
							.getAccession());
					if (seq != null)
						return new ProteinId(seq.getRefId());

				}
			}
			return new ProteinId();
		} else {
			return new ProteinId();
		}
	}

	public SequenceDao getSequenceDao() {
		return sequenceDao;
	}

	public void setSequenceDao(SequenceDao sequenceDao) {
		this.sequenceDao = sequenceDao;
	}
}
