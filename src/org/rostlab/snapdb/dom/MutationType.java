package org.rostlab.snapdb.dom;

public enum MutationType {
	SNAP(0), SIFT(1);
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
		}
		return null;
	}
}
