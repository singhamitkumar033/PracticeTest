package com.collection.test;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<Integer> l1=new ArrayList<Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		System.out.println(l1.size());
		ArrayList<Integer> l2=l1;
		l2.add(3);
		System.out.println(l1.size());
		System.out.println(l2.size());
	
	}

}
