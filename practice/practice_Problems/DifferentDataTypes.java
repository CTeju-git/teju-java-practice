package practice_Problems;

import java.util.Scanner;

public class DifferentDataTypes {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter an integer ");
		int i= scan.nextInt();
		System.out.println("please enter a double value");
		double d=scan.nextDouble();
		double res=i+d;
		System.out.println("The result is ="+res);
		scan.close();
	}
}
