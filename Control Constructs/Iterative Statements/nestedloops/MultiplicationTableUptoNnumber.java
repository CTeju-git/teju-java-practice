package com.kn.nestedloops;

import java.util.Scanner;

public class MultiplicationTableUptoNnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num=scan.nextInt();
		printMultiplicationTable(num);
		scan.close();
		
	}

	public static void printMultiplicationTable(int num) {
		// TODO Auto-generated method stub
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
		}
	}

}
