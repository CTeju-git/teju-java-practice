package com.kn.forloop;

import java.util.Scanner;

public class SumOfNSquareNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter N Value = ");
		int n=scan.nextInt();
		int sum=0;
		scan.close();
		squareNumbers(n,sum);
	}

	public static void squareNumbers(int n,int sum) {
		// TODO Auto-generated method stub
		for(int i=1;i<=n;i++) {
			sum=sum+(i*i);
		}
		System.out.println(sum);
	}

}
