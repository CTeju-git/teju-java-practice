package com.kn.elseifladder;

import java.util.Scanner;

public class CategoryOfScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter your marks = ");
		int marks=scan.nextInt();
		isCategory(marks);
		scan.close();
	}

	 static void isCategory(int marks) {
		// TODO Auto-generated method stub
		if(marks>=90 && marks<=100)
			System.out.println("A");
		else if(marks>=80&&marks<=89) 
			System.out.println("B");
		else if(marks>=70&&marks<=79)
			System.out.println("C");
		else if(marks>=60&&marks<=69)
			System.out.println("D");
		else if(marks<60)
			System.out.println("F");
	}

}
