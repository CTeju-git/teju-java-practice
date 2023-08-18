package com.kn.whileloop;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter a number = ");
		int num=scan.nextInt();
		int r,a=0,b=1;
		while(num>0) {
			r=num%10;
			a=a+r;
			b=b*r;
			num=num/10;
			scan.close();
		}
		if(a==b)
			System.out.println("Spy Number");
		else
			System.out.println("Not a Spy Number");
	}

}
