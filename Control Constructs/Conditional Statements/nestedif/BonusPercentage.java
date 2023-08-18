package com.kn.nestedif;

import java.util.Scanner;

public class BonusPercentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your years of experience = ");
		int experience=scan.nextInt();
		isBonus(experience);
		scan.close();
	}

	 static void isBonus(int experience) {
		// TODO Auto-generated method stub
		if(experience>=2) {
			if(experience>=2 && experience <=8)
				System.out.println("10% of Bonus");
			else if(experience>=9 && experience <=14)
				System.out.println("20% of Bonus");
			else if(experience>=15 && experience <=22)
				System.out.println("30% of Bonus");
			else if(experience>22)
				System.out.println("50% of Bonus");
		}
	
		else
			System.out.println("No Bonus Applicable");
	}

}
