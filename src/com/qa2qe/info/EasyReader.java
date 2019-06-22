package com.qa2qe.info;

import java.util.Scanner;

public class EasyReader {
	Classroom clas = new Classroom();
	Scanner sc1 = new Scanner(System.in);
	int s;
	public void read(char ch) {
		while (!(ch == 'Q')) {
			if (ch == 'A') {
				System.out.println("Enter the Number to Add to class count");
				 s = sc1.nextInt();
				clas.updated = clas.noofstudent + s;
			} else if (ch == 'R') {
				s=sc1.nextInt();	
				if (clas.updated > s) {
					System.out.println("Enter the Number to remove from class count");
					 s=sc1.nextInt();	
					clas.updated = clas.noofstudent - s;
				} else if (clas.updated <= s)
					clas.updated = 0;
			} else if (ch == 'L') {
				 s=sc1.nextInt();	
				if (s == 1 || s == 2 || s == 3) {
					System.out.println("The user has switch the :" + s + " no light");
				} else {
					System.out.println("User is not able to switch the light");
				}
			} else if (ch == 'O') {
				 s=sc1.nextInt();	
				if (s > 0) {
					System.out.println("The user has turned off the :" + s + " no light");
				} else {
					System.out.println("User is not able to turned off the light");
				}
			} else {
				System.out.println("Not a valid input");
			}
		}
		if (ch == 'Q') {
			System.exit(0);
		}
	}
}
