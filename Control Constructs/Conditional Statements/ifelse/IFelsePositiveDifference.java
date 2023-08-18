package com.kn.ifelse;

import java.util.Scanner;

public class IFelsePositiveDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("enter 2 numbers for calculating difference");
		int a=scan.nextInt();
		int b=scan.nextInt();
		scan.close();
		if(a>b)
			System.out.println("The difference is = "+(a-b));
		else
			System.out.println("The difference is = "+(b-a));
	}

}
