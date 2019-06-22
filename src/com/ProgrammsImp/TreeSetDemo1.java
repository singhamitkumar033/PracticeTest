package com.ProgrammsImp;

import java.util.TreeSet;

public class TreeSetDemo1 {

	public static void main(String[] args) {
		TreeSet treeSet = new TreeSet();
//treeSet.add(new Employee());
		treeSet.add(new Employee(3, "Ravina", (double) 60000));
		treeSet.add(new Employee(6, "Amruta", (double) 90000));
		treeSet.add(new Employee(5, "Martca", (double) 90000));
		treeSet.add(new Employee(7, "Sri", (double) 90000));
		treeSet.add(new Employee(2, "Yaha", (double) 90000));
		System.out.println(treeSet);
	}

}
