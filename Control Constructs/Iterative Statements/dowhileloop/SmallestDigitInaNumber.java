package com.kn.dowhileloop;

import java.util.Scanner;

public class SmallestDigitInaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int num=scan.nextInt();
		scan.close();
		int small=smallestDigit(num);
		System.out.println(small);
	}

	public static int smallestDigit(int num) {
		// TODO Auto-generated method stub
		int r=1,a=1;;
		do {
			r=num%10;
			if(r<a)
				a=r;
			num/=10;
			
		}while(num>0);
		return a;
	}

}
