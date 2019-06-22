package important;

import java.util.Scanner;

public class OddEven1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number which you want to check");
		n = sc.nextInt();
		while (n > 0) {
			n = n - 2;
		}
		if (n == 0) {
			System.out.println("Even number");
		} else {
			System.out.println("odd Number");
		}
		sc.close();
	}
}
