package com.kn.switchcase;

import java.util.Scanner;

public class PolygonType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter  no of sides = ");
		int sides=scan.nextInt();
		polygonSides(sides);
		scan.close();
	}

	 static void polygonSides(int sides) {
		// TODO Auto-generated method stub
		switch(sides) {
		case 3:
			System.out.println("Triangle");
			break;
		case 4:
			System.out.println("Quadrilateral");
			break;
		case 5:
			System.out.println("Pentagon");
			break;
		case 6:
			System.out.println("Hexagon");
			break;
		case 7:
			System.out.println("Heptagon");
			break;
		case 8:
			System.out.println("Octagon");
			break;
		case 9:
			System.out.println("Nanogon");
			break;
		case 10:
			System.out.println("Decagon");
			break;
			default:
				System.out.println("Invalid sides for polygon");
		}
	}

}
