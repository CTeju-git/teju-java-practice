package com.kn.nestedloops;

import java.util.Scanner;

public class FactorialUptoN_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter a number = ");
		int a =scan.nextInt();
		int b=1;
		scan.close();
		printFactorial(a,b);
	}
		public static void printFactorial(int a,int b) {
			for(int i=1;i<=a;i++) {
				for(int j=1;j<=i;j++) {
					b=b*j;
				}
				System.out.println("The factorial of "+i+" is = "+b);
				b=1;
			}
		}
	

}
