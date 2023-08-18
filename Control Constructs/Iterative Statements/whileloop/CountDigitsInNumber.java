package com.kn.whileloop;

import java.util.Scanner;

public class CountDigitsInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number = ");
		int num=scan.nextInt();
		
		int count=0;
		while(num>0) {
			
			count++;
			num=num/10;
		}
		System.out.println("Count of digits in a number = "+count);
		scan.close();
	}

}
