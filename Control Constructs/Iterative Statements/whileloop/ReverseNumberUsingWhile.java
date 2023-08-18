package com.kn.whileloop;

import java.util.Scanner;

public class ReverseNumberUsingWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number = ");
		int num=scan.nextInt();
		int r;
		System.out.print("Reversed number is = ");
		while(num>0) {
			r=num%10;
			System.out.print(r);
			num=num/10;
		}
		scan.close();
	}

}
