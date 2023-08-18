package com.kn.dowhileloop;

import java.util.Scanner;

public class NumberOfDigitsInaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int num=scan.nextInt();
		scan.close();
		int count=numberOfDigits(num);
		System.out.println(count);
	}

	public static int numberOfDigits(int num) {
		// TODO Auto-generated method stub
		int c=0;
		do {
			c++;
			num=num/10;
		}while(num>0);
		return c;
	}

}
