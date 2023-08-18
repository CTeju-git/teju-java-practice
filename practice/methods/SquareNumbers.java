package methods;

import java.util.Scanner;

public class SquareNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number to calculate square");
		int num=scan.nextInt();
		int power=squareNumber(num);
		System.out.println("The square of the given number is ="+power);
		scan.close();
	}

	public static int squareNumber(int num) {
		// TODO Auto-generated method stub
		return num*num;

	}

}
