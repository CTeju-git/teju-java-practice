package com.kn.ifelse;

import java.util.Scanner;

public class PassFail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your marks = ");
		int marks=scan.nextInt();
		boolean grade=isPassOrFail(marks);
		if(grade) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		scan.close();
	}

	 static boolean isPassOrFail(int marks) {
		// TODO Auto-generated method stub
		 if(marks>50) {
			 return true;
		 }
		 else {
			 return false;
		 }
	}

}
