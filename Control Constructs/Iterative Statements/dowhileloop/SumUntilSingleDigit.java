package com.kn.dowhileloop;

import java.util.Scanner;

public class SumUntilSingleDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int num =scan.nextInt();
		scan.close();
		System.out.println(sumOfDigits(num));

	}

	public static int sumOfDigits(int num) {
		// TODO Auto-generated method stub
		int r=0,sum=0;
		do {
			do {
				r=num%10;
				sum=sum+r;
				num=num/10;
			}while(num>0);
			num=sum;
			sum=0;
		}while(num>9);
		return num;
	}

}
