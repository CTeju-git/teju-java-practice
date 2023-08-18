package com.kn.whileloop;

import java.util.Scanner;

public class SumOfNOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number for odd ");
		int n=scan.nextInt();
		int sum=0;
		scan.close();
		sumOfNOddNumbers(n,sum);
	}

	public static void sumOfNOddNumbers(int n,int sum) {
		// TODO Auto-generated method stub
		int r=1;
		while(n>0) {
			if(r%2!=0) {
				sum=sum+r;
				n--;
			}
			r++;
		}
		System.out.println(sum);
		
	}

}
