package javaInterview;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class Pelindrome {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		int n, r, res = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		n = sc.nextInt();
		
//		Robot rb=new Robot();
//	    rb.keyPress(KeyEvent.VK_CAPS_LOCK);
		int temp = n;
		while (n > 0) {
			r = n % 10;
			res = (res * 10) + r;
			n = n / 10;
		}
		if (temp == res) {
			System.out.println("Pelindrome");
		} else {
			System.out.println("not a Pelindrome");
		}
		sc.close();
	}

}
