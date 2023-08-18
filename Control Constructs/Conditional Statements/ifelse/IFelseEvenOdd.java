package com.kn.ifelse;

import java.util.Scanner;

public class IFelseEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number to find even or odd");
		int a=scan.nextInt();
		if(a%2==0)
			System.out.println("Given number is even");
		else
			System.out.println("Given number is odd");
		scan.close();
	}

}
