package com.kn.switchcase;

import java.util.Scanner;

public class RomanDecimalNumbers {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Roman Value = ");
		String roman=scan.next();
		romanDecimalNumbers(roman);
		scan.close();
	}

	private static void romanDecimalNumbers(String roman) {
		// TODO Auto-generated method stub
		switch(roman) {
		case "I":
			System.out.println("1");
			break;
		case "II":
			System.out.println("2");
			break;
		case "III":
			System.out.println("3");
			break;
		case "IV":
			System.out.println("4");
			break;
		case "V":
			System.out.println("5");
			break;
		case "VI":
			System.out.println("6");
			break;
		case "VII":
			System.out.println("7");
			break;
		case "VIII":
			System.out.println("8");
			break;
		case "IX":
			System.out.println("9");
			break;
		case "X":
			System.out.println("10");
			break;
		default:
			System.out.println("Select among only above roman numbers");
		}
	}

}
