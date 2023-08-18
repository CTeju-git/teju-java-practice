package com.kn.whileloop;

import java.util.Scanner;

public class FrequencyOfDigitsInANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a large number with repeated digits = ");
		long num=scan.nextLong();
		System.out.println("Enter a digit = ");
		int a=scan.nextInt();
		int count=0;
		scan.close();
		System.out.println("The frequency of a digit = "+frequencyOfDigits(num,count,a));
	}

	public static int frequencyOfDigits(long num,int count,int a) {
		// TODO Auto-generated method stub
		while(num>0) {
			int r=(int) (num%10);
			if(a==r) {
				count++;
			}
			num/=10;
			
		}
		return count;
	}

}
