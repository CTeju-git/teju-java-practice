package com.kn.switchcase;

import java.util.Scanner;

public class SwitchVIBGYOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter an alphabet");
		char c=scan.next().charAt(0);
		switch(c) {
		case 'v':
		case 'V':
			System.out.println("violet color");
			break;
		case 'i':
		case 'I':
			System.out.println("indigo color");
			break;
		case 'b':
		case 'B':
			System.out.println("blue color");
			break;
		case 'g':
		case 'G':
			System.out.println("green color");
			break;
		case 'y':
		case 'Y':
			System.out.println("yellow color");
			break;
		case 'o':
		case 'O':
			System.out.println("orange color");
			break;
		case 'r':
		case 'R':
			System.out.println("red color");
			break;
		default:
			System.out.println("Invalid input");
		}
		System.out.println("-----> The End <-----");
		scan.close();
	}

}
