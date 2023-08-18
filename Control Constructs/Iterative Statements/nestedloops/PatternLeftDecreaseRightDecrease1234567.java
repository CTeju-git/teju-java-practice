package com.kn.nestedloops;

import java.util.Scanner;

public class PatternLeftDecreaseRightDecrease1234567 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no of rows = ");
		int rows=scan.nextInt();
		scan.close();
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=rows+(rows-1);j++) {
				if(j-i>=rows-1 || j<=(rows+1)-i ) {
					System.out.print(j);
				}
				else
					System.out.print(" ");
			}
			System.out.println(" ");
		}
	}

}
