package ternary_Operators;

import java.util.Scanner;

public class SmallestAmongThreeNumbersUsingTernaryOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter First Number = ");
		int a=scan.nextInt();
		System.out.print("Enter Second Number = ");
		int b=scan.nextInt();
		System.out.print("Enter Third Number = ");
		int c= scan.nextInt();
		int d= (a<b)?((a<c)?a:c):((b<c)?b:c);
		System.out.println("The smallest among three numbers using Ternary operator = " +d);
		scan.close();
	}

}
