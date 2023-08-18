package com.kn.forloop;

import java.util.Scanner;

public class SumOfDigitsInGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int num =scan.nextInt();
		int r=0,sum=0;
		scan.close();
		System.out.println(sumOfDigits(num,r,sum));
		
	
	}

	public static int sumOfDigits(int num, int r, int sum) {
		// TODO Auto-generated method stub
		for(;num>0;) {
			r=num%10;
			sum=sum+r;
			num=num/10;
		}
		return sum;
	}

}
