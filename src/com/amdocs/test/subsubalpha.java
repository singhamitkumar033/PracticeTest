package com.amdocs.test;

class alpha {
	static String s = "";

	protected alpha() {
		s += "alpha";
	}
}

class subclass extends alpha {
	private subclass() {
		s += "sub";
	}

}

public class subsubalpha extends alpha {
	private subsubalpha() {
		s += "subsub";
	}

	public static void main(String[] args) {
		new subsubalpha();
		System.out.println(s);

	}

}
