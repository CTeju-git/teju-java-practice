package com.kn.switchcase;

import java.util.Scanner;

public class PlanetsName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter planets number from the sun = ");
		int planet=scan.nextInt();
		planetsName(planet);
		scan.close();
	}

	 static void planetsName(int planet) {
		// TODO Auto-generated method stub
		switch(planet) {
		case 1:
			System.out.println("Mercury");
			break;
		case 2:
			System.out.println("Venus");
			break;
		case 3:
			System.out.println("Earth");
			break;
		case 4:
			System.out.println("Mars");
			break;
		case 5: 
			System.out.println("Jupiter");
			break;
		case 6:
			System.out.println("Saturn");
			break;
		case 7:
			System.out.println("Uranus");
			break;
		case 8:
			System.out.println("Neptune");
			break;
		default:
			System.out.println("Invalid planet number");
		}
	}

}
