package methods;

import java.util.Scanner;

public class TheDoubleTrouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number to double the number");
		int num=scan.nextInt();
		int doubleNumber=doubleTheNumber(num);
		System.out.println("The double of the given number is ="+doubleNumber);
		scan.close();
	}

	public static int doubleTheNumber(int num) {
		// TODO Auto-generated method stub
		return num*2;
	}

}
