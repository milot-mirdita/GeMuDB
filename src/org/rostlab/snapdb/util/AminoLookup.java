package org.rostlab.snapdb.util;

public class AminoLookup {
	// A C D E F G H I K L M
	// N P Q R S T V W Y
	final private static int[] lookupAA = { 0, -1, 1, 2, 3, 4, 5, 6, 7, -1, 8,
			9, 10,11, -1, 12, 13, 14, 15, 16, -1, 17, 18, 19, 20, -1 };
			
			
	// A C D E F G H I K L M
	// N P Q R S T V W Y
	final private static char[] reversAA = { 'A', 'C', 'D', 'E', 'F', 'G', 'H',
			'I', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y' };

	public static int lookupAAtoIndex(char aa) {
		return lookupAA[aa - 65];
	}

	public static char reversLookup(int index) {
		return reversAA[index];
	}

}
