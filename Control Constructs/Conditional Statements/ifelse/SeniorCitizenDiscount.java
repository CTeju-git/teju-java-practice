package com.kn.ifelse;

import java.util.Scanner;

public class SeniorCitizenDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age = ");
		int age=scan.nextInt();
		boolean flag=isSeniorCitizenDiscount(age);
		scan.close();
		if(flag)
			System.out.println("Senior Citizen Discount Eligible");
		else
			System.out.println("Senior Citizen Discount is not Eligible");
	}

	 static boolean isSeniorCitizenDiscount(int age) {
		if(age>=50) 
			return true;
		else
			return false;
	}

}
