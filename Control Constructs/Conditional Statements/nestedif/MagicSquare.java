package com.kn.nestedif;

import java.util.Scanner;

public class MagicSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length = ");
		int l=scan.nextInt();
		System.out.println("Enter breadth = ");
		int b=scan.nextInt();
		isSquare(l,b);
		scan.close();
	}

	 static void isSquare(int l, int b) {
		// TODO Auto-generated method stub
		if(l==b) {
			System.out.println("Square");
			l=((l/2)*(l*l+1));
		}
		else
			System.out.println("Not a square");
	}

}
