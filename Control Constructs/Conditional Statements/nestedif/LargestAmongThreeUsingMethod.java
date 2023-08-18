package com.kn.nestedif;

import java.util.Scanner;

public class LargestAmongThreeUsingMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first number = ");
		int a =scan.nextInt();
		System.out.print("Enter second number = ");
		int b =scan.nextInt();
		System.out.print("Enter three number = ");
		int c =scan.nextInt();
		int d=isLargest(a,b,c);
		if(d==0)
			System.out.println("Equal");
		else {
			System.out.println(d+" is largest ");
		}
		scan.close();
	}

	 static int isLargest(int a, int b, int c) {
		// TODO Auto-generated method stub
		if(a==b && b==c) {
			return 0;
		}
		else {
			if(a>b)
				if(a>c)
					return a;
				else
					return c;
			else
				if(b>c)
					return b;
				else
					return c; 
		}
			
	}

}
