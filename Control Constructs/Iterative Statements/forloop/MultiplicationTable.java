package com.kn.forloop;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter which number mutiples you want to print = ");
		int num=scan.nextInt();
		System.out.print("Enter how many multiples you need for a given number = ");
		int b=scan.nextInt();
		multiplicationTable(num,b);
		scan.close();
	}

	public static void multiplicationTable(int num, int b) {
		// TODO Auto-generated method stub
		for(int i=1;i<=b;i++) {
			System.out.println(num+" * "+i+" = "+ (num*i));
		}
	}

}
