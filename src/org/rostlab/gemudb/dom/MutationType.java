package org.rostlab.gemudb.dom;

public enum MutationType {
	SNAP(0), SIFT(1), ALL(2);
	final private int code;

	private MutationType(int c) {
		code = c;
	}

	public int getCode() {
		return code;
	}
	
	public static MutationType parseCode(int code){
		switch(code){
		case 0: return SNAP;
		case 1: return SIFT;
		case 2: return ALL;
		}
		return null;
	}
}
