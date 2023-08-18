package com.kn.nestedloops;

import java.util.Scanner;

public class PatternTriangle_InvertedTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no of rows = ");
		int rows=scan.nextInt();
		scan.close();
		int k=0;
		for(int i=1;i<=rows;i++) {
			if(i<=rows/2+1) {
				k++;
			}
			else
				k--;
			for(int j=1;j<=rows;j++) {
				if(j>=5-k && j<=k+3)
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			System.out.println(" ");
		}
		
		//for(int i=1;i<=rows;i++) {
			//for(int j=1;j<=rows+(rows-1);j++) {
				//if(i+j>=(rows+1) && j-i<=rows-1 && i<=j && i+j<=rows+rows)
					//System.out.print("*");
				//else
					//System.out.print(" ");
			//}
			//System.out.println(" ");
		//}
	}

}
