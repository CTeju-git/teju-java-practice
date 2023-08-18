package com.kn.switchcase;

import java.util.Scanner;

public class ProductNameUsingCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a product code");
		int code=scan.nextInt();
		productName(code);
		scan.close();
	}

	 static void productName(int code) {
		// TODO Auto-generated method stub
		switch(code) {
		case 0:
			System.out.println("Gold");
			break;
		case 1:
			System.out.println("Book");
			break;
		case 2:
			System.out.println("Dress");
			break;
		case 3:
			System.out.println("Automobile");
			break;
		case 4:
			System.out.println("Soap");
			break;
		case 5: 
			System.out.println("Laptop");
			break;
		case 6:
			System.out.println("Makeup");
			break;
		case 7:
			System.out.println("Bed");
			break;
		case 8:
			System.out.println("Utensils");
			break;
		case 9:
			System.out.println("CupBoard");
			break;
		default:
			System.out.println("Invalid Product");
		}
	}

}
