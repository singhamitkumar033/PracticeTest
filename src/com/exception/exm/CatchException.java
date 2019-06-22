package com.exception.exm;

public class CatchException {
	public static void main(String[] args) {

		try {
			int y = 10 / 0;
			/*
			 * String a = null; //null value System.out.println(a.charAt(0));
			 */
		} catch (ArithmeticException e) {
			System.out.println("Successfully checked Arithmatic exception \n");
		}
		catch(Exception e) {
			System.out.println("Successfully checked exception \n");
		}
	}
}
