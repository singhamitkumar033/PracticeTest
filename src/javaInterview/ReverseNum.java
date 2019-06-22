package javaInterview;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, r, res = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		n = sc.nextInt();
		while (n > 0) {
			r = n % 10;
			res = (res * 10) + r;
			n = n / 10;
		}
		System.out.println("reverse number is --> " + res);
		sc.close();
	}
}
