package com.kn.dowhileloop;

import java.util.Scanner;

public class AverageOfNnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter n number = ");
		double n=scan.nextDouble();
		scan.close();
		double average=calculateAverage(n);
		System.out.println(average);
	}

	public static double calculateAverage(double n) {
		double average=0;
		// TODO Auto-generated method stub
		int i=1;
		do {
			average=average+i;
			i++;
		}while(i<=n);
		average=average/n;
		return average;
	}

}
