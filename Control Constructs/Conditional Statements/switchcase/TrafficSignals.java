package com.kn.switchcase;
import java.util.Scanner;
public class TrafficSignals {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a color = ");
		String color=scan.next();
		trafficSignals(color);
		scan.close();
	}
	 static void trafficSignals(String color) {
		switch(color) {
		case "Red":
			System.out.println("Stop the vehicle");
			break;
		case "Yellow":
			System.out.println("Get Ready to move ");
			break;
		case "Green":
			System.out.println("Move the vehicle");
			break;
			default:
				System.out.println("Enter correct traffic color");
		}
	}
}
