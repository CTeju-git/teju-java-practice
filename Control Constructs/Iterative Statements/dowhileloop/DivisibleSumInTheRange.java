package com.kn.dowhileloop;

import java.util.Scanner;

public class DivisibleSumInTheRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the start range = ");
		int start=scan.nextInt();
		System.out.println("Enter the end range = ");
		int end=scan.nextInt();
		System.out.println("Enter the divisor = ");
		int div=scan.nextInt();
		scan.close();
		int sum= divisibleSum(start,end,div);
		System.out.println(sum);
	}

	public static int divisibleSum(int start, int end, int div) {
		// TODO Auto-generated method stub
		int sum=0,i=start;
		do {
			if(i%div==0)
				sum=sum+i;
			i++;
		}while(i<=end);
		return sum;
	}

}
