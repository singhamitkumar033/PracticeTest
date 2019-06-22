package com.exception.exm;

public class Finally1 {
	public static void main(String[] args) {
		System.out.println("Main Started");
		try {
			int i = 10 / 0;
			System.out.println("Result " + i);
		} catch (NumberFormatException e) {
			System.out.println("Catch Block");
		} finally {
			System.out.println("Finally Block");
			System.out.println("Main Completed");
		}
	}
}
