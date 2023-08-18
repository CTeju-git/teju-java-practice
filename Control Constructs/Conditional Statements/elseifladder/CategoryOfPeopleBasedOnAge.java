package com.kn.elseifladder;

import java.util.Scanner;

public class CategoryOfPeopleBasedOnAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter your age = ");
		int age=scan.nextInt();
		isCategory(age);
		scan.close();
	}

	 static void isCategory(int age) {
		// TODO Auto-generated method stub
		if(age>=0 && age<=12)
			System.out.println("Child");
		else if(age>=13&&age<=19) 
			System.out.println("Teen");
		else if(age>=20&&age<=59)
			System.out.println("Adult");
		else 
			System.out.println("Senior");
		
	}

}
