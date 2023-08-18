package com.kn.forloop;

import java.util.Scanner;

public class SumOfNnaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a natural number = ");
		int a =scan.nextInt();
		int b=0;
		System.out.println(sumOfNnatuturalNumbers(a,b));
		
		scan.close();
	}

	public static int sumOfNnatuturalNumbers(int a, int b) {
		// TODO Auto-generated method stub
		for(int i=1;i<=a;i++) {
			b=b+i;
		}
		return b;
	}

}
