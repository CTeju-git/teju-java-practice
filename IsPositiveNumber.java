package com.kn.simpleif;
import java.util.Scanner;
public class IsPositiveNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("enter a number = ");
		int num=scan.nextInt();
		scan.close();
		boolean flag=isPositiveNumber(num);
		if(flag) {
			System.out.println("Given number "+num+" is POSITIVE");
		}
		else{
			System.out.println("Given number "+num+" is NEGATIVE");
		}
	}
	 static boolean isPositiveNumber(int num) {
		 if(num>0) {
			 return true;
		 }
		 else {
			 return false;
		 }	
	}
}
