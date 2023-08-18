package com.kn.ifelse;

import java.util.Scanner;

public class LeapYearOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a year = ");
		int num=scan.nextInt();
		boolean flag=isLeapOrNot(num);
		if(flag)
			System.out.println("Leap Year");
		else
			System.out.println("Not a Leap Year");
		scan.close();
	}

	 static boolean isLeapOrNot(int num) {
		// TODO Auto-generated method stub
		 if((num%4==0 )&& (num%400==0 || num%100!=0))
			 return true;
		 else
			 return false;
		
	}
}
