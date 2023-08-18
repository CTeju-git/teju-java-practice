package com.kn.nestedloops;
import java.util.Scanner;
public class PatternHourglassShape {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no of rows = ");
		int rows=scan.nextInt();
		scan.close();
		int k=rows;
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=rows+(rows-1);j++) {
				if(i<=j && i+j<=rows+rows) {
					if(k>1) {
						System.out.print(k);
						k--;
					}
					else {
						System.out.print(k);
						k++;
					}
				}
				else
					System.out.print(" ");
			}
			System.out.println(" ");
		}
		k=rows;
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=rows+(rows-1);j++) {
				if(i+j>=rows+1 && rows-1>=j-i) {
					if(k>1) {
						System.out.print(k);
						k--;
					}
					else {
						System.out.print(k);
						k++;
					}
				}
				else
					System.out.print(" ");
			}
			System.out.println(" ");
		}
	}

}
