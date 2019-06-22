package com.amdocs.test;

public class Programm1 {
	public static void main(String[] args) {
		Programm1 pm=new Programm1();
		System.out.println(pm.add(2, 4));
		System.out.println(1);
	}

	public int add(int x, int y) {
		int sum = x + y;
		return sum;

	}
}
