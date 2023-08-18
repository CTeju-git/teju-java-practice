package com.kn.nestedif;

import java.util.Scanner;

public class LargestAmongThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter First Number = ");
		int a=scan.nextInt();
		System.out.print("Enter Second Number = ");
		int b=scan.nextInt();
		System.out.print("Enter Third Number = ");
		int c= scan.nextInt();
		if(a>b) {
			if(a>c)
				System.out.println("a is largest");
			else
				System.out.println("c is largest");
		}
		else
			if(b>c)
				System.out.println("b is largest");
			else
				System.out.println("c is largest");
		scan.close();
	}

}
