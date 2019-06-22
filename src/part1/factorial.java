package part1;

import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, f = 1,n;
		System.out.println("Ente the num");
		Scanner in = new Scanner(System.in);
		  n=in.nextInt();
		if (n >= 0) {
			for (i = 1; i <= n; i++) {
				f = f * i;
			}
			// System.out.println("Factorial is : "+f);
		}
		System.out.println("Factorial is : " + f);
		in.close();
	}

}