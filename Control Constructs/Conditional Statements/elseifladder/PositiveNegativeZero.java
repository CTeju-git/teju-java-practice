package com.kn.elseifladder;

import java.util.Scanner;

public class PositiveNegativeZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int num=scan.nextInt();
		isPositveNegativeZero(num);
		scan.close();
	}

	 static void isPositveNegativeZero(int num) {
		// TODO Auto-generated method stub
		if(num>0)
			System.out.println("Positive");
		else if(num<0)
			System.out.println("Negative");
		else
			System.out.println("Zero");
	}

}
