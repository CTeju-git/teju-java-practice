package com.kn.nestedif;
import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a year = ");
		int year=scan.nextInt();
		isLeapYear(year);
		scan.close();
	}
	 static void isLeapYear(int year) {
		 if(year%4==0) {
			 if(year%100!=0||year%400==0) {
					System.out.println("Given year is Leap Year");
					if(year>=2001 && year<=2100)
						System.out.println("Current Century");
					else
						System.out.println("Not a current Century");
			 }
			 else {
				 System.out.println("Given year is Not a Leap Year");
			 }
		 }
		else {
			System.out.println("Given year is Not a  Leap Year");
		}	
	}
		
		
		
		
		
	

}
