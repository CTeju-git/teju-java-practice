package com.kn.forloop;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a number = ");
		int num=scan.nextInt();
		int b=1,c=0,a=0;
		System.out.println(a);
		System.out.println(b);
		fibonacciSeries(a,b,c,num);
		scan.close();
	}
	public static void fibonacciSeries(int a, int b, int c ,int num) {
		// TODO Auto-generated method stub
		for(int i=1;i<num-1;i++) {
			c=a+b;			
			System.out.println(c);
			a=b;
			b=c;
		}
	}

}
