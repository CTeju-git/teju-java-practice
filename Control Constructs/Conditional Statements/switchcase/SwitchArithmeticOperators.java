package com.kn.switchcase;
import java.util.Scanner;
public class SwitchArithmeticOperators {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose any symbol in these -   *  /  %");
		char c =scan.next().charAt(0);
		if(c=='-'||c=='*'||c=='/'||c=='%') {
			System.out.println("Enter two numbers for the selected operation");
			int a=scan.nextInt();
			int b=scan.nextInt();
			scan.close();
			switch(c) {
			case '-':
				int sub= subtractNumbers(a,b);
				System.out.println("The subratction of the given 2 numbers is ="+sub);
				break;
			case '*':
				int mul= multiplyNumbers(a,b);
				System.out.println("The multiplication of the given 2 numbers is ="+mul);
				break;
			case '/':
				double div=divideNumbers(a,b);
				System.out.println("The division of the given 2 numbers is ="+div);
				break;
			case '%':
				int rem=findRemainder(a,b);
				System.out.println("The remainder of the given 2 numbers is ="+rem);
				break;
			}
		}
		else
			System.out.println("invalid input");
		
	}
		
		static int subtractNumbers(int num1,int num2)
		{
			return num1-num2;
		}
		static int multiplyNumbers(int num1,int num2) {
			return num1*num2;
		}
		static double divideNumbers(int num1,int num2) {
			return num1/num2;
		}
		static int findRemainder(int num1,int num2) {
			return num1%num2;
		}
		
		
}
