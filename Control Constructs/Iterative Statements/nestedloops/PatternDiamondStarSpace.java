package com.kn.nestedloops;
import java.util.Scanner;
public class PatternDiamondStarSpace {
	public static void main(String[] args) {
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
				if(j+k==rows/2+2 || j-k==rows/2) 
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			System.out.println(" ");
		}
				// (Or)
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=rows;j++) {
				if(i+j==rows/2+2 || j-i==rows/2 || i-j==rows/2 || i+j==rows+(rows/2+1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println(" ");
		}
		
				
		
	}

}
