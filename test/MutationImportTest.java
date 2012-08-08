import java.io.File;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.rostlab.gemudb.dao.MutationDao;
import org.rostlab.gemudb.dao.SequenceDao;
import org.rostlab.gemudb.dom.Sequence;
import org.rostlab.gemudb.service.MutationImportServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
// specifies the Spring configuration to load for this test fixture
@ContextConfiguration(locations = { "file:config/Application-Context.xml" })
public final class MutationImportTest {

	@Autowired
	private SequenceDao sequenceDao;

	@Autowired
	private MutationDao mutationDao;

	@Autowired
	private MutationImportServiceImpl mutationImportService;

	@Test
	public void bugImport() {
		mutationImportService.parseSiftMutationFile(new File(
				"input/NP_114066.SIFTprediction"), new Sequence());
	}

	@Test
	public void doImport() {
		mutationImportService.importMutation(new File("input/"));
	}

	@Test
	public void deleteSequnece() {
		mutationDao.deleteAll();
		sequenceDao.deleteAll();

	}

}