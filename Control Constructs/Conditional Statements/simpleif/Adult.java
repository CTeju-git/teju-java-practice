package com.kn.simpleif;

import java.util.Scanner;

public class Adult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age = ");
		int age=scan.nextInt();
		isAdult(age);
		scan.close();
	}

	 static void isAdult(int age) {
		if(age>21) 
			System.out.println("Adult");
		
	}

}
