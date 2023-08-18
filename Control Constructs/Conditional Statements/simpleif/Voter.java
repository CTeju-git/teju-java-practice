package com.kn.simpleif;

import java.util.Scanner;

public class Voter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age = ");
		int age=scan.nextInt();
		isAdult(age);
		scan.close();
	}

	 static void isAdult(int age) {
		if(age>=18) 
			System.out.println("Vote Eligible");
	}

}
