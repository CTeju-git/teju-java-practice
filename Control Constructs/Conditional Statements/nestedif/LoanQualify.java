package com.kn.nestedif;

import java.util.Scanner;

public class LoanQualify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age = ");
		int age=scan.nextInt();
		System.out.println("Enter your Income");
		int income=scan.nextInt();
		loanQualification(age,income);
		scan.close();
	}

	 static void loanQualification(int age, int income) {
		// TODO Auto-generated method stub
		if(age>18) {
			if(income<=30000 && income>=20000)
				System.out.println("Eligible for Loan upto 200000");
			else if(income<=50000 && income>=30000)
				System.out.println("Eligible for Loan upto 400000");
			else if(income<20000)
				System.out.println("Not Eligible for loan because of less income");
		}
		else
			System.out.println("Not Eligible for Loan because of age limit");
	}

}
