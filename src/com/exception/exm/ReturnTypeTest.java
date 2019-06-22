package com.exception.exm;

import java.io.File;
import java.io.FileNotFoundException;

public class ReturnTypeTest {

	public static void main(String[] args) throws FileNotFoundException, ArithmeticException {
		int r = new Hello().show();
		File file = new File("c/dna");
		
		System.out.println("r : " + r);
		System.out.println("Main Completed");
	}
}

class Hello {
	int show() {
		int a = 0;
		try {
			System.out.println("Try Blocks Begins : " + a);
			a = 10 / 4;
			System.out.println("Try Block COmpleted : " + a);
			// System.exit(0);
			return a;
		} catch (ArithmeticException e) {
			a = 20;
			System.out.println("Catch Block :" + a);
			return a;
		} finally {
			a = 30;
			System.out.println("Finally Block : " + a);
			return a;
			// int arr[] = new int[-1];
			// System.out.println(arr[0]);
		}
	}
}
