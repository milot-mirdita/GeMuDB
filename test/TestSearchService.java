import static org.junit.Assert.*;

import org.junit.Test;
import org.rostlab.snapdb.service.SearchProtein;
import org.rostlab.snapdb.service.SearchProteinImpl;


public class TestSearchService {
	final private static String seq="MKAQNLLKLTSPGPAPASCQHLQAQPLPHGGFSRPSSSSGLSLQAQLLLHNSLFWPSSCP"+
"AHSGQCRPKTSSSQTPQARLLLPGGMNRPSFDLRTASAGRALASQGLLQAQLLPHGGCPR"+
"PSFCLPASSLNRHSSSLTVAHLGPTHDCRAISRPSACLLADS";
	@Test
	public void testSeq() {
		SearchProtein searchProtein = new SearchProteinImpl();
		assertEquals("XP_002344320",searchProtein.searchProtein(seq));
	}

	
	@Test
	public void testId() {
		SearchProtein searchProtein = new SearchProteinImpl();
		assertEquals("XP_002344320",searchProtein.searchProtein("XP_002344320"));
	}
	
	@Test
	public void testIdWitheSpace() {
		SearchProtein searchProtein = new SearchProteinImpl();
		assertEquals("XP_002344320",searchProtein.searchProtein(" XP_002344320 "));
	}

}
