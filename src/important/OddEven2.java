package important;

import java.util.Scanner;

public class OddEven2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		n = sc.nextInt();
		if ((n & 1) == 0)
			System.out.println("Even");
		else
			System.out.println("odd number");
		sc.close();
	}
}
