package com.kn.simpleif;

import java.util.Scanner;

public class IFprogram {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your marks");
		int marks=scan.nextInt();
		if(marks>=90)
			System.out.println("Welcome to TechClub");
		scan.close();
	}
}
