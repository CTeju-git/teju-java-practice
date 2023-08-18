package com.kn.dowhileloop;

import java.util.Scanner;

public class AutomorphicNumberUsingDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int num=scan.nextInt();
		scan.close();
		boolean flag =isUtomorphicNumber(num);
		if(flag)
			System.out.println("true");
		else
			System.out.println("false");
	}

	public static boolean isUtomorphicNumber(int num) {
		// TODO Auto-generated method stub
		int temp=num;
		num=num*num;
		if(temp==num%10)
			return true;
		else
			return false;
	}

}
