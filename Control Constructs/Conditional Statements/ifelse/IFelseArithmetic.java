package com.kn.ifelse;

import java.util.Scanner;

public class IFelseArithmetic {

	public static void main(String[] args) {		
		System.out.println("Choose any one operation in these operators  +  -   *   /");
		System.out.println("+ is for addition");
		System.out.println("- is for subtraction");		
		System.out.println("* is for multiplication");		
		System.out.println("/ is for division");
		Scanner scan=new Scanner(System.in);
		char c=scan.next().charAt(0);
		if (c=='+')
			add();
		else if(c=='-')
			sub();
		else if(c=='*')
			mul();
		else if(c=='/')
			div();
		else
			System.out.println("Invalid charcter");
		scan.close();
	}
		static void add() {
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter two integers for addition");
			int a=scan.nextInt();
			int b=scan.nextInt();
			System.out.println("The addition is = "+(a+b));
			scan.close();
		}
		static void sub() {
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter two integers for subtraction");
			int a=scan.nextInt();
			int b= scan.nextInt();
			System.out.println("The subtraction is = "+(a-b));
			scan.close();
		}
		static void mul() {
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter two integers for multiplication");
			int a=scan.nextInt();
			int b= scan.nextInt();
			System.out.println("The product is = "+(a*b));
			scan.close();
		}
		static void div() {
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter two integers for division");
			int a=scan.nextInt();
			int b= scan.nextInt();
			System.out.println("The division is = "+(a/b));
			scan.close();
		}
		
	

}
