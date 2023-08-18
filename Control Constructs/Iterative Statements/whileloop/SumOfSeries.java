package com.kn.whileloop;

import java.util.Scanner;

public class SumOfSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int n=scan.nextInt();
		scan.close();
		sumOfseries(n);
	}

	public static void sumOfseries(int n) {
		// TODO Auto-generated method stub
		double i=1;
		double sum=0;
		while(i<=n) {
			sum=sum+(1/i);
			i++;
		}
		System.out.println(sum);
	}

}
