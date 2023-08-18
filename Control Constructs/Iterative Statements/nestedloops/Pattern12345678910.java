package com.kn.nestedloops;

import java.util.Scanner;

public class Pattern12345678910 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter no of rows");
		int rows=scan.nextInt();
		scan.close();
		int num=1;
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=i;j++) {
					System.out.print(num+" ");
					
					num++;
				
			}
			System.out.println(" ");
		}
	}

}
