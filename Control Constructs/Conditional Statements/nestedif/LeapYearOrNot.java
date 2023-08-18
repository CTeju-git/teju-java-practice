package com.kn.nestedif;

import java.util.Scanner;

public class LeapYearOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a year = ");
		int year=scan.nextInt();
		if(year%4==0 && year%100==0) {
			if(year%400==0) {
				System.out.println("Given is leap year");
			}
			else {
				System.out.println("Not a leap year");
			}
		}
		else {
			System.out.println("Not a leap year");
		}
		scan.close();
	}

}
