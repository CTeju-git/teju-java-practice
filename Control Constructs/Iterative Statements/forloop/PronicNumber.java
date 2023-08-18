package com.kn.forloop;

import java.util.Scanner;

public class PronicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int n=scan.nextInt();
		int a=0;
		for(int i=0;i<=n;i++) {
			a=i*(i+1);
			if(a==n) {
				System.out.println(i+" "+(i+1));
				System.out.println("Given number is pronic number");
				break;
			}
			if(i==n)
				System.out.println("Not a pronic number ");
			scan.close();
		}
		
	}
}
