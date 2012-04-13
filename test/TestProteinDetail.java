import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.rostlab.snapdb.service.ProteinDetailService;
import org.rostlab.snapdb.service.model.ProteinDetail;
import org.rostlab.snapdb.service.model.NcbiSnpDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
// specifies the Spring configuration to load for this test fixture
@ContextConfiguration(locations = { "file:config/Application-Context.xml" })
public class TestProteinDetail {
	@Autowired
	private ProteinDetailService proteinDetailService;

	@Test
	public void testId() {
		ProteinDetail pd = proteinDetailService.getProteinDetail("NP_005378");
		assertEquals("NUP98", pd.getOfficialGenSymbol());
		assertEquals("11p15.5", pd.getGenLocation());
		assertEquals("Homo sapiens", pd.getOrganismName());
		assertEquals("Homo sapiens (human)", pd.getSource());
	}

	@Test
	public void testSnp() {
		NcbiSnpDetail pd = proteinDetailService.getProteinSnpDetail("NP_001073592.1");
//		assertEquals("NUP98", pd.getOfficialGenSymbol());
//		assertEquals("11p15.5", pd.getGenLocation());
//		assertEquals("Homo sapiens", pd.getOrganismName());
//		assertEquals("Homo sapiens (human)", pd.getSource());
	}
}
