package com.collection.test;

import java.util.Set;
import java.util.TreeSet;

public class Lab628 {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(10);
		ts.add(18);
		ts.add(61);
		ts.add(8);
		ts.add(91);
		ts.add(01);
		System.out.println(ts);
		// Changes the TreeSet in Descending order
		Set ts1 = ts.descendingSet();
		System.out.println(ts1);

		int[] employee = { 1, 2, 73, 627, 6626, 6 };
		int nb[] = new int[2];
		nb[0] = 6;
		nb[1] = 2;
		nb[2] = 6;
		nb[3] = 9;
		for (int i = 0; i < nb.length; i++) {
			System.out.println(nb[i]);
		}
		TreeSet<StringBuffer> tset = new TreeSet<StringBuffer>();
	}
}
