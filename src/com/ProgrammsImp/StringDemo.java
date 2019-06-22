package com.ProgrammsImp;

public class StringDemo {

	public static void main(String[] args) {
		// String s= new String("Bhagyashri");
		String s = "Bhagyashri";
		// System.out.println(s.substring(0,5));
		String s1 = "Bhagyashri";
		String snew1=new String("Bhagyashri");
		String snew2=new String("Bhagyashri");
		System.out.println(s==s1);
		System.out.println(s==snew1);
		System.out.println(snew1==snew2);
		System.out.println(snew1.equals(snew2));
		System.out.println(s.equals(snew1));
		System.out.println(s.equals(snew2));
		// System.out.println(s+ " "+s1);
		if (s == s1) {
			if (s.equals(s1)) {
				System.out.println("s is equal to s1 its true majja machho");
			} else {

				System.out.println("s is not eual to s1 arrererer");
			}
			String s2 = s.concat(" Wagle");
			System.out.println(s);
			System.out.println(s2);
			StringBuffer sb = new StringBuffer("Icchhram");
			System.out.println(sb);
			sb.append(" Paatil");
			System.out.println(sb);
		}
	}
}
