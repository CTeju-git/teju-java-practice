package com.kn.nestedloops;

import java.util.Scanner;

public class Pattern1010101010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no of rows = ");
		int rows=scan.nextInt();
		scan.close();
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=i;j++) {
				if((i+j)%2==0)
					System.out.print("1");
				else
					System.out.print("0");
				System.out.print(" ");
			}
			System.out.println(" ");
		}
	}

}
