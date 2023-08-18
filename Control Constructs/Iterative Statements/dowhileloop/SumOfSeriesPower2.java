package com.kn.dowhileloop;

import java.util.Scanner;

public class SumOfSeriesPower2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int n=scan.nextInt();
		scan.close();
		int sum=sumOfseries(n);
		System.out.println(sum);
	}

	public static int sumOfseries(int n) {
		// TODO Auto-generated method stub
		int i=1;
		int sum=0;
		do{
			sum=sum+(i*i);
			i++;
		}while(i<=n);
		return(sum);
	}
		
}
