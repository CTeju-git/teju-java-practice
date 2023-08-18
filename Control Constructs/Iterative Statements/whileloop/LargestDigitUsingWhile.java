package com.kn.whileloop;

import java.util.Scanner;

public class LargestDigitUsingWhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number = ");
		int num=scan.nextInt();
		int a=0,b=0;
		scan.close();
		largestDigit(num,a,b);
	}

	public static void largestDigit(int num, int a, int b) {
		while(num>0) {
			a=num%10;
			if(a>b)
				b=a;
			num/=10;
		}
		System.out.println("The largest digit = "+b);
	}

}
