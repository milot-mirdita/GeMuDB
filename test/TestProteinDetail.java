import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.rostlab.gemudb.service.ProteinDetailService;
import org.rostlab.gemudb.service.model.ExternalMutationContainer;
import org.rostlab.gemudb.service.model.ExternalMutationDetail;
import org.rostlab.gemudb.service.model.ExternalMutationPos;
import org.rostlab.gemudb.service.model.OmimEntry;
import org.rostlab.gemudb.service.model.ProteinDetail;
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
		ExternalMutationContainer pd = proteinDetailService
				.getProteinExternalSnpDetail("NP_001073592", 1);
		for (ExternalMutationPos emp : pd.getExternalMutationPosition()) {
			for (ExternalMutationDetail nsd : emp.getExternalMutations()) {
				System.out.println("Snpid: " + nsd.getSnpid());
				System.out.println("Mutation: " + nsd.getMutation());
				System.out.println("Position: " + nsd.getPosition());
				System.out.println("Effect: " + nsd.getEffect());
				for (OmimEntry oe : nsd.getOmimEntries()) {
					System.out.println("Omimid: " + oe.getLinkId());
				}
			}
		}
		// assertEquals("NUP98", pd.getOfficialGenSymbol());
		// assertEquals("11p15.5", pd.getGenLocation());
		// assertEquals("Homo sapiens", pd.getOrganismName());
		// assertEquals("Homo sapiens (human)", pd.getSource());
	}

	@Test
	public void testSnpNoResult() {
		ExternalMutationContainer pd = proteinDetailService
				.getProteinExternalSnpDetail("NP_005378", 0);
		for (ExternalMutationPos emp : pd.getExternalMutationPosition()) {
			for (ExternalMutationDetail nsd : emp.getExternalMutations()) {
				System.out.println("Snpid: " + nsd.getSnpid());
				System.out.println("Mutation: " + nsd.getMutation());
				System.out.println("Position: " + nsd.getPosition());
				System.out.println("Effect: " + nsd.getEffect());
				for (OmimEntry oe : nsd.getOmimEntries()) {
					System.out.println("Omimid: " + oe.getLinkId());
				}
			}
		}
		// assertEquals("NUP98", pd.getOfficialGenSymbol());
		// assertEquals("11p15.5", pd.getGenLocation());
		// assertEquals("Homo sapiens", pd.getOrganismName());
		// assertEquals("Homo sapiens (human)", pd.getSource());
	}

	@Test
	public void testSnpNoOmim() {
		ExternalMutationContainer pd = proteinDetailService
				.getProteinExternalSnpDetail("NP_653088", 1);
		for (ExternalMutationPos emp : pd.getExternalMutationPosition()) {
			for (ExternalMutationDetail nsd : emp.getExternalMutations()) {
				System.out.println("Snpid: " + nsd.getSnpid());
				System.out.println("Mutation: " + nsd.getMutation());
				System.out.println("Position: " + nsd.getPosition());
				System.out.println("Effect: " + nsd.getEffect());
				for (OmimEntry oe : nsd.getOmimEntries()) {
					System.out.println("Omimid: " + oe.getLinkId());
				}
			}
		}
		// assertEquals("NUP98", pd.getOfficialGenSymbol());
		// assertEquals("11p15.5", pd.getGenLocation());
		// assertEquals("Homo sapiens", pd.getOrganismName());
		// assertEquals("Homo sapiens (human)", pd.getSource());
	}
}
