package org.rostlab.snapdb.service;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.rostlab.snapdb.dao.SequenceDao;
import org.rostlab.snapdb.dom.Sequence;
import org.rostlab.snapdb.service.model.ProteinId;
import org.rostlab.snapdb.util.BlankRemover;

import uk.ac.ebi.demo.picr.business.PICRClient;
import uk.ac.ebi.demo.picr.soap.CrossReference;
import uk.ac.ebi.demo.picr.soap.UPEntry;

public class SearchProteinServiceImpl implements SearchProteinService {
	private SequenceDao sequenceDao;
	private PICRClient client = new PICRClient();
	private java.util.List<String> databases;
	public SearchProteinServiceImpl() {
//		  databases = client.loadDatabases();
		databases = new ArrayList<String>();
		databases.add("REFSEQ");
	}
	@Override
	public ProteinId searchProtein(String searchString) {
		searchString = BlankRemover.trim(searchString);
		Pattern pattern = Pattern.compile("^[A-Z]{19}.*");
		Matcher matcher = pattern.matcher(searchString);
		java.util.List<UPEntry> entries;
		if (matcher.matches()) { // AA
			searchString = "> SEQ \n"+searchString;
			entries = client.performSequenceMapping(
					searchString, databases.toArray());

		} else { // ID
			entries = client.performAccessionMapping(
					searchString, databases.toArray());

		}
		if(entries!=null&&entries.size() > 0){
			for (UPEntry entry : entries) {
				for (CrossReference xref : entry.getIdenticalCrossReferences()) {
					Sequence seq = sequenceDao.selectByRefId(xref.getAccession());
					if(seq!=null)
						return new ProteinId(seq.getId());
					
				}
			}
			return new ProteinId();
		}else {
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
