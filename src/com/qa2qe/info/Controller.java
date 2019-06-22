package com.qa2qe.info;

import java.util.Scanner;

public class Controller extends Classroom{

	public static void main(String[] args) {
		EasyReader esr = new EasyReader();
		Classroom cls = new Classroom();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character");
		char ch=sc.next().charAt(0);
		esr.read(ch);
		System.out.println(cls.noofstudent);
		System.out.println(cls.updated);
		sc.close();
		Controller Controller=new Controller();
		Controller.test();
	}

}
