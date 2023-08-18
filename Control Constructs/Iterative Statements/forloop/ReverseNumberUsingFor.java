package com.kn.forloop;

import java.util.Scanner;

public class ReverseNumberUsingFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number = ");
		int num=scan.nextInt();
		int r=0;
		scan.close();
		reversedNumber(num,r);
		
		
	}

	private static void reversedNumber(int num, int r) {
		// TODO Auto-generated method stub
		System.out.print("Reversed number is = ");
		for(;num>0;) {
			r=num%10;
			System.out.print(r);
			num=num/10;
		}
	}

}
