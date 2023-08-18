package com.kn.whileloop;

import java.util.Scanner;

public class SpecialTwoDigitNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int num=scan.nextInt();
		int r,a=0,b=1,temp=num;
		while(num>0) {
			r=num%10;
			a=a+r;
			b=b*r;
			num=num/10;
			scan.close();
		}
		if((a+b)==temp)
			System.out.println("Special 2-digit number");
		else {
			System.out.println("Not a Special 2-digit number");
		}
	}

}
