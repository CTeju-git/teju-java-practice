package com.kn.nestedloops;

import java.util.Scanner;

public class PatternRideSideAndLeftSideTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no of rows = ");
		int rows=scan.nextInt();
		scan.close();
		int k=0;
		for(int i=1;i<=rows;i++) {
			if(i<=rows/2+1) 
				k++;
			else
				k--;
			for(int j=1;j<=rows;j++) {
				if(k>=j || j+k>=rows+1) 
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			System.out.println(" ");
		}
	}

}
