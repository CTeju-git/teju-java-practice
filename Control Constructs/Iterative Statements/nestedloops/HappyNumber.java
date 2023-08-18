package com.kn.nestedloops;

import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number for happy number= ");
		int num=scan.nextInt();
		int r,a=0;
		while(num!=1) {
			while(num>0) {
				r=num%10;
				a=a+(r*r);
				num=num/10;
			}
			num=a;
			a=0;
		}
		if(num==1)
			System.out.println("Happy Number");
		else
			System.out.println("Not a Happy Number");
		scan.close();
		
	}

}
