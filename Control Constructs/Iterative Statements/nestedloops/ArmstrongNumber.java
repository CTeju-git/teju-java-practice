package com.kn.nestedloops;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int num=scan.nextInt();
		int r,sum=0,temp=num;
		while(num>0) {
			r=num%10;
			r=r*r*r;
			sum=sum+r;
			num=num/10;
		}
		if(temp==sum)
			System.out.println("Given number is Armstrong");
		else
			System.out.println("Given number is not an Armstrong");
		scan.close();
	}

}
