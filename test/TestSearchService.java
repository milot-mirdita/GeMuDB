import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.rostlab.snapdb.service.SearchProteinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
// specifies the Spring configuration to load for this test fixture
@ContextConfiguration(locations = { "file:config/Application-Context.xml" })
public class TestSearchService {
	final private static String seq = "MAPQSLPSSRMAPLGMLLGLLMAACFTFCLSHQNLKEFALTNPEKSSTKET" +
			"ERKETKAEEELDAEVLEVFHPTHEWQALQPGQAVPAGSHVRLNLQTGEREAKLQYEDKFRNNLKGKRLDINTNTYTSQ" +
			"DLKSALAKFKEGAEMESSKEDKARQAEVKRLFRPIEELKKDFDELNVVIETDMQIMVRLINKFNSSSSSLEEKIAALFD" +
			"LEYYVHQMDNAQDLLSFGGLQVVINGLNSTEPLVKEYAAFVLGAAFSSNPKVQVEAIEGGALQKLLVILATEQPLTAKKKVL" +
			"FALCSLLRHFPYAQRQFLKLGGLQVLRTLVQEKGTEVLAVRVVTLLYDLVTEKMFAEEEAELTQEMSPEKLQQYRQVHLLPGLW" +
			"EQGWCEITAHLLALPEHDAREKVLQTLGVLLTTCRDRYRQDPQLGRTLASLQAEYQVLASLELQDGEDEGYFQELLGSVNSLLKELR";
	@Autowired
	private SearchProteinService searchProteinService;

	@Test
	public void testSeq() {
		assertEquals("NP_005378", searchProteinService.searchProtein(seq).getRefId());
	}

	@Test
	public void testId() {
		assertEquals("NP_005378",
				searchProteinService.searchProtein("NP_005378").getRefId());
	}

	@Test
	public void testIdWitheSpace() {
		assertEquals("NP_005378",
				searchProteinService.searchProtein(" NP_005378 ").getRefId());
	}

}
