package com.ProgrammsImp;

import java.util.Scanner;

class CheckEvenOdd {

	public static void main(String args[]) {
		/*int num;
		String name;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter yoiu name");
		name = input.nextLine();
		System.out.println("Enter an Integer number:");
		num = input.nextInt();
		if (num % 2 == 0)
			System.out.println("Hi " + name + " Entered number is even");
		else
			System.out.println("Hi " + name + " Entered number is odd");
		input.close();*/
		int num1 = 12;
		int num2 = 3;
		int modulus = num1 % num2;
		int divide = num1 / num2;
		System.out.println("modulus :" + modulus);
		System.out.println("division :" + divide);
		int modulus1 = num1 % 10;
		int divide1 = num1 / 10;
		System.out.println("modulus1 :" + modulus1);
		System.out.println("modulus1 :" + divide1);
	}

}
