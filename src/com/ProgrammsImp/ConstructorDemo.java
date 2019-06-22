package com.ProgrammsImp;

import java.util.ArrayList;

public class ConstructorDemo {
	public static void main(String[] args) {
		ArrayList<Student> al= new ArrayList<>();
		Student s1= new Student();
		s1.setRollNo(3);
		s1.setName("Icchhram");
		s1.setAddress("Dhule");
		System.out.println(s1);
		al.add(s1);
		System.out.println(al);
		Student s2=new Student(24);
		s2.setName("Aakash");
		s2.setAddress("Pachora");
		System.out.println(s2);
		al.add(s2);
		System.out.println(al);
		al.add(new Student(33,"Bhagyashri","Bhusawal"));
		System.out.println(al);
	
	}
	/*void main (String[] args)
	{
		
	}
*/
}
