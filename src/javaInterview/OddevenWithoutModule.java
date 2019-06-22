package javaInterview;

import java.util.Scanner;

public class OddevenWithoutModule {

	public static void main(String[] args) {
		System.out.println("Enter the no to check Odd or Even");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		int sum = 0;
		while (n > 0) {
			n = n - 2;
		}
		 
		System.out.println(sum);
		if (n == 0)
			System.out.println(+temp + " is Even number");

		else
			System.out.println(+temp + " is Odd Number");
		sc.close();
	}

}
