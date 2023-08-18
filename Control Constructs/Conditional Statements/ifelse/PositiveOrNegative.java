package com.kn.ifelse;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a number = ");
		int num=scan.nextInt();
		boolean flag=isPositiveOrNegative(num);
		if(flag) {
			System.out.println("Positive");
		}
		else {
			System.out.println("Negative");
		}
		scan.close();
	}

	 static boolean isPositiveOrNegative(int num) {
		// TODO Auto-generated method stub
		 	if(num>0) {
		 		return true;
		 	}
		 	else if(num<0) {
		 		return false;
		 	}
		return false;
	}

}
