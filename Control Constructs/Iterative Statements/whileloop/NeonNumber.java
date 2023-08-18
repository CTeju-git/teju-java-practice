package com.kn.whileloop;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int num=scan.nextInt();
		int r=0,temp=num;
		num=num*num;
		while(num>0) {
			r=r+(num%10);
			num=num/10;
		}
		if(r==temp)
			System.out.println("Neon Number");
		else
			System.out.println("Not a Neon Number");
		scan.close();
	}

}
