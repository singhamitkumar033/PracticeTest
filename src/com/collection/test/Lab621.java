package com.collection.test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Lab621 {

	public static void main(String[] args) {
		// Does not Maintains the Order of insertion
		// fast for searching and retrieving Element
		HashSet hs = new HashSet();
		hs.add("sri");
		hs.add("Nivas");
		hs.add(99);
		hs.add("DK");
		hs.add("Manish");
		System.out.println(hs);

		// Maintains the Order of insertion
		// Subclass of HasSet
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("sri");
		lhs.add("Nivas");
		lhs.add(99);
		lhs.add("DK");
		lhs.add("Manish");
		System.out.println(lhs);

		// It stores the element in sorted order.
		// CompareTo method is used to identify the object uniquely and manage to
		// maintain the sorted order in TreeSet.
		// The object we r adding in TreeSet must be subType of Comparable Interface
		// If object is not Comparable it will throw ClassCastException
		// TreeSet Allows to Store similar type of elements
		// Null value is not allowed in TreeSet
		TreeSet ts = new TreeSet();
		ts.add("sri");
		ts.add("Nivas");
		// below will throw ClassCastException
		//ts.add(99);
		ts.add("DK");
		ts.add("Manish");
		System.out.println(ts);
		TreeSet ts1 = new TreeSet();
		ts1.add(3);
		ts1.add(5);
		// below will throw ClassCastException
		ts1.add(99);
		ts1.add(81);
		ts1.add(82);
		System.out.println(ts1);

	}

}
