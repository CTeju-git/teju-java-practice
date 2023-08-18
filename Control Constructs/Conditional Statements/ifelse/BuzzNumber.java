package com.kn.ifelse;

import java.util.Scanner;

public class BuzzNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int num=scan.nextInt();
		if(num%10==7 || num%7==0)
			System.out.println("Buzz Number");
		else
			System.out.println("Not a Buzz Number");
		scan.close();
	}

}
