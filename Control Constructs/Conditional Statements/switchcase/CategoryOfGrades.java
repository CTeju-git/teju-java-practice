package com.kn.switchcase;

import java.util.Scanner;

public class CategoryOfGrades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter your grade = ");
		char grade=scan.next().charAt(0);
		isCategory(grade);
		scan.close();
	}

	 static void isCategory(char grade) {
		// TODO Auto-generated method stub
		 switch(grade) {
		 case 'A':
			 System.out.println("90-100");
			 break;
		 case 'B':
			 System.out.println("80-89");
			 break;
		 case 'C':
			 System.out.println("70-79");
			 break;
		 case 'D':
			 System.out.println("60-69");
			 break;
		 case 'F':
			 System.out.println("<60");
			 break;
		 default:
			 System.out.println("Invalid grade");
		 }
	}

}
