package com.ProgrammsImp;

import java.util.Scanner;

public class StaticInstenceExample {
	static String name;
	
	public static void main(String[] args) {
		StaticInstenceExample siExample = new StaticInstenceExample();
		/*StaticInstenceExample.oddEvenCheck();*/
		siExample.isPrime();
	}

	private static void oddEvenCheck(int num) {
		if (num % 2 == 0)
			System.out.println("Hi " + name + " Entered number is even");
		else
			System.out.println("Hi " + name + " Entered number is odd");
	}

	private void isPrime() {
		int temp;
		boolean isPrime = true;
		Scanner scan = new Scanner(System.in);
		System.out.println( "Hi "+name+"Enter any number:");
		// capture the input in an integer
		int num = scan.nextInt();
		scan.close();
		for (int i = 2; i <= Math.sqrt(num); i++) {
			temp = num % i;
			if (temp == 0) {
				isPrime = false;
				break;
			}
		}
		// If isPrime is true then the number is prime else not
		if (isPrime)
			System.out.println(num + " is a Prime Number");
		else
			System.out.println(num + " is not a Prime Number");

		StaticInstenceExample.oddEvenCheck(num);
	}

}
