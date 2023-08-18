package com.kn.whileloop;

import java.util.Scanner;

public class ProductOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number = ");
		int num=scan.nextInt();
		int r=0,sum=1;
		scan.close();
		productOfDigits(num,r,sum);
	}

	public static void productOfDigits(int num, int r, int sum) {
		// TODO Auto-generated method stub
		while(num>0) {
			r=num%10;
			sum=sum*r;
			num=num/10;
		}
		System.out.println(sum);
	}

}
