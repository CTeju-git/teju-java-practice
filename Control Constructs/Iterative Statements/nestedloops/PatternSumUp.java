package com.kn.nestedloops;

import java.util.Scanner;

public class PatternSumUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no of rows = ");
		int rows=scan.nextInt();
		int a=0;
		scan.close();
		int columns=rows+rows-1;
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=columns;j++) {
				if(i+j==rows+1 || j-i==rows-1) {
					System.out.print("1");
				}
				else if(j-i==1 || i+j==columns) {
					if( i!=1)
						System.out.print(a);
					else
						System.out.print(" ");
				}
				else 
					System.out.print(" ");
			}
			++a;
			System.out.println(" ");
		}
	}

}
