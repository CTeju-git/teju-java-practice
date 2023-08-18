package com.kn.nestedloops;

import java.util.Scanner;

public class Pattern_InvertedTriangle_Traingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no of rows = ");
		int rows=scan.nextInt();
		scan.close();
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=rows+(rows-1);j++) {
				if(i<=j && i+j<=rows+rows)
					System.out.print((char)(64+i));
				else
					System.out.print(" ");
			}
			System.out.println(" ");
		}
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=rows+(rows-1);j++) {
				if(i+j>=rows+1 && rows-1>=j-i)
					System.out.print((char)(64+i));
				else
					System.out.print(" ");
			}
			System.out.println(" ");
		}
	}

	
}
