package com.kn.whileloop;

import java.util.Scanner;

public class HarshadNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a number = ");
		int num=scan.nextInt();
		scan.close();
		int r=0;
		int temp=num;
		while(num>0) {
			
			r=r+(num%10);
			num=num/10;
		}
		
		if(temp%r==0) {
			System.out.println("Given number is harshad number");
		}
		else {
			System.out.println("Not a harshad number");
		}
	}

}
