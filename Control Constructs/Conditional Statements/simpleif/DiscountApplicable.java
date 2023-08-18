package com.kn.simpleif;
import java.util.Scanner;
public class DiscountApplicable {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("enter a number = ");
		int num=scan.nextInt();
		scan.close();
		boolean flag=isDiscountApplicable(num);
		if(flag) {
			System.out.println("Discount Applicable");
		}
		else{
			System.out.println("Discount Not Applicable");
		}
	}
	
	  static  boolean isDiscountApplicable(int num) {
		 if(num>100) {
			 return true;
		 }
		 else {
			 return false;
		 }
		
	}

	

}
