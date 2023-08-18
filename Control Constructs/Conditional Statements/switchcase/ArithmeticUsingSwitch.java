package com.kn.switchcase;

import java.util.Scanner;

public class ArithmeticUsingSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your operation = ");
		char c=scan.next().charAt(0);
		System.out.println("Enter a number");
		int a=scan.nextInt();
		System.out.println("Enter another number ");
		int b=scan.nextInt();
		arithmetcSwitch(c,a,b);
		scan.close();
	}

	 static void arithmetcSwitch(char c,int a,int b) {
		// TODO Auto-generated method stub
		 switch(c) {
		 case '+':
			 System.out.println("Addition "+(a+b));
			 break;
		 case '-':
			 System.out.println("Subtraction "+(a-b));
			break;
		 case '*':		
			 System.out.println("Multiplication "+(a*b));
			 break;
		 case '/':
			 System.out.println("Division "+(a/b));
			break;
		 }
		
		 
		
	
	}

}
