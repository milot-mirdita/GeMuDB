import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.rostlab.snapdb.service.SearchProteinService;
import org.rostlab.snapdb.service.SearchProteinServiceImpl;


public class TestSearchService {
	final private static String seq="MKAQNLLKLTSPGPAPASCQHLQAQPLPHGGFSRPSSSSGLSLQAQLLLHNSLFWPSSCP"+
"AHSGQCRPKTSSSQTPQARLLLPGGMNRPSFDLRTASAGRALASQGLLQAQLLPHGGCPR"+
"PSFCLPASSLNRHSSSLTVAHLGPTHDCRAISRPSACLLADS";
	@Test
	public void testSeq() {
		SearchProteinService searchProtein = new SearchProteinServiceImpl();
		assertEquals("XP_002344320",searchProtein.searchProtein(seq));
	}

	
	@Test
	public void testId() {
		SearchProteinService searchProtein = new SearchProteinServiceImpl();
		assertEquals("XP_002344320",searchProtein.searchProtein("XP_002344320"));
	}
	
	@Test
	public void testIdWitheSpace() {
		SearchProteinService searchProtein = new SearchProteinServiceImpl();
		assertEquals("XP_002344320",searchProtein.searchProtein(" XP_002344320 "));
	}

}
