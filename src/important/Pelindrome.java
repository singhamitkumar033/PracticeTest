package important;

import java.util.Scanner;

public class Pelindrome {

	public static void main(String[] args) {
		int n, r, res = 0;
	/*	Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");*/
		n = 121;
		int temp = n;
		while (n > 0) {
			r = n % 10;
			res = (res * 10) + r;
			n = n / 10;
		}
		if (temp == res) {
			System.out.println(temp+" is Pelindrome");
		} else {
			System.out.println(temp+"not a Pelindrome");
		}
		//sc.close();
	}
}
