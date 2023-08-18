package com.kn.ifelse;

import java.util.Scanner;

public class AutomorphicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int num=scan.nextInt();
		int temp=num;
		num=num*num;
		if(temp==(num%10))
			System.out.println("Automorphic Number");
		else
			System.out.println("Not an Automorphic Number");
		scan.close();
	}

}
