package practice_Problems;

import java.util.Scanner;

public class BooleanInput {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User! please enter a boolean value");
		boolean b=scan.nextBoolean();
		System.out.println("The boolean value is = "+ b);
		scan.close();
	}
}
