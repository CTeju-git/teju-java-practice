package com.kn.nestedloops;

import java.util.Scanner;

public class Pattern12345to1to12345 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter no of rows");
		int rows=scan.nextInt();
		scan.close();
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=rows;j++) {
				if(i+j<=6)
					System.out.print(j);
				else
					System.out.print(" ");
			}
			System.out.println(" ");
		}
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=rows;j++) {
				if(i>=j)
					System.out.print(j);
				else
					System.out.print(" ");
			}
			System.out.println(" ");
		}
	}

}
