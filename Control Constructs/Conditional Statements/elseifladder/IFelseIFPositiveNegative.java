package com.kn.elseifladder;

import java.util.Scanner;

public class IFelseIFPositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number for finding that a number is positive or negative");
		int a=scan.nextInt();
		if(a>0)
			System.out.println("Given number is a positive number");
		else if(a<0)
			System.out.println("Given number is a negative number");
		else 
			System.out.println("Given number is neither positive nor negative");
		scan.close();
	}

}
