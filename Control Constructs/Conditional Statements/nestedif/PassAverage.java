package com.kn.nestedif;

import java.util.Scanner;

public class PassAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter test 1 marks = ");
		int a=scan.nextInt();
		System.out.println("Enter test 2 marks = ");
		int b=scan.nextInt();
		System.out.println("Enter test 3 marks = ");
		int c=scan.nextInt();
		int average=passAverage(a,b,c);
		scan.close();
		if(average==0) {
			System.out.println("Not passed");
		}
		else
			System.out.println("The average of three tests is = "+average);
	}

	 static int passAverage(int a, int b, int c) {
		// TODO Auto-generated method stub
		 if(a>=35 && b>=35 && c>=35) {
			 int avg=(a+b+c)/3;
			 return avg;
		 }
		 else
			 return 0;
		
	}

}
