package com.kn.forloop;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scan.nextInt();
		int count=0;
		isPrime(num,count);
		scan.close();
	}

	 static void isPrime(int num,int count) {
		// TODO Auto-generated method stub
		for(int i=2;i<=num/2;i++) {
			if(num%i==0)
				count++;
		}
		if(count==0)
			System.out.println("Prime number");
		else
			System.err.println("Not a Prime Number");
	}

}
