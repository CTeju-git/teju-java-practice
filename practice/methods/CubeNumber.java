package methods;

import java.util.Scanner;

public class CubeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number to calculate cube");
		int num=scan.nextInt();
		int power=cubeNumber(num);
		System.out.println("The power of the given number is ="+power);
		scan.close();
	}

	public static int cubeNumber(int num) {
		// TODO Auto-generated method stub
		return num*num*num;

	}
	

}
