package com.kn.forloop;

import java.util.Scanner;

public class GCDofTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a number = ");
		int a=scan.nextInt();
		System.out.print("Enter another number = ");
		int b=scan.nextInt();
		scan.close();
		System.out.println(gcdOfTwoNumbers(a,b));
		
	}

	public static int gcdOfTwoNumbers(int a, int b) {
		// TODO Auto-generated method stub
		int gcd = 0;
		for(int i=1;i<=a && i<=b;i++) {
			if(a%i==0 && b%i==0)
				  gcd=i;
		}
		return gcd;
	}

}
