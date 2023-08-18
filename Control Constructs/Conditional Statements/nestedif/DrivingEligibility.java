package com.kn.nestedif;

import java.util.Scanner;

public class DrivingEligibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age = ");
		int age=scan.nextInt();
		System.out.println("Enter your Vision Score");
		double vision=scan.nextDouble();
		loanQualification(age,vision);
		scan.close();
	}

	 static void loanQualification(int age, double vision) {
		// TODO Auto-generated method stub
		 if(age>=18) {
			 if(age>=18 && age<=23) {
				 if(vision<=0.35 && vision>=0.1)
					 System.out.println("Eligible for license");
				 else
					 System.out.println("Not Eligible for license because of vision");
			 }
			 else if(age>=24 && age<=29) {
				 if(vision<=0.24 && vision>=0.1)
					 System.out.println("Eligible for license");
				 else
					 System.out.println("Not Eligible for license because of vision");
			 }
			 else if(age>=30) {
				 if(vision<=0.18 && vision>=0.1)
					 System.out.println("Eligible for license");
				 else
					 System.out.println("Not Eligible for license because of vision");
			 }
		 }
		 else
			 System.out.println("Not a eligible for driving because of age");
	}

}
