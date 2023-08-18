package com.kn.forloop;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number = ");
		int num=scan.nextInt();
		System.out.print("Enter a power = ");
		int power=scan.nextInt();
		int product=1;
		scan.close();
		System.out.println(powerOfNumber(num,power,product));
	}

	public static int powerOfNumber(int num, int power, int product) {
		// TODO Auto-generated method stub
		for(int i=1;i<=power;i++) {
			product=product*num;
		}
		return product;
	}

}
