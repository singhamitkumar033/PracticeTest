package com.regex.test;

public class SumOfDigitsInString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "1Kritika123is321My98Name1add3";
		String arr[] = str.split("[a-zA-Z]+");
		for (String string : arr) {
			System.out.println(string);
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].matches("[0-9]+"))
				sum = sum + Integer.parseInt(arr[i]);
		}
		System.out.println(sum);
	}
}
