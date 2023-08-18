package practice_Problems;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan=new Scanner(System.in);
			System.out.println("enter a number");
			int a =scan.nextInt();
			int square=a*a;
			System.out.println("the square of a given number is ="+ square);
			scan.close();
	}

}
