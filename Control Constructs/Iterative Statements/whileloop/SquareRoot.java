package com.kn.whileloop;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int num=scan.nextInt();
		scan.close();
		squareRoot(num);
		
	}

	public static void squareRoot(int num) {
		// TODO Auto-generated method stub
		int i=1;
		while(i<=num) {
			if((i*i)==num) {
				System.out.println(i);
				break;
			}
			i++;
		}
	}

}
