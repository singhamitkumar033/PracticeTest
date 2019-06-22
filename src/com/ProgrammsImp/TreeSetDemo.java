package com.ProgrammsImp;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		//TreeSet<Student> s = new TreeSet<Student>();
		TreeSet<Student> studentSet = new TreeSet<>();
		/*
		 * s.add(23); s.add(0); s.add(56);
		 */
		//studentSet.add(new Student());
		studentSet.add(new Student(6, "Bhagyashri", "Wagle"));
		studentSet.add(new Student(6, "Supriya", "Jagtap"));
		studentSet.add(new Student(24,"Supriya" , "jagtap"));
		System.out.println(studentSet);
	}

}
