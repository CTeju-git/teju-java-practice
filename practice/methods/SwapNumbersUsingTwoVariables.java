package methods;

import java.util.Scanner;

public class SwapNumbersUsingTwoVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter first number = ");
		int a =scan.nextInt();
		System.out.println("Enter Second Number = ");
		int b =scan.nextInt();
		swapNumbers(a,b);
		scan.close();
	}

	public static void swapNumbers(int a, int b) {
		// TODO Auto-generated method stub
		a=a+b;
		b=a-b;
		a=a-b;
		
		//a=a*b;
		//b=a/b;
		//a=a/b;
		System.out.println("a="+a+" b="+b);
		
	}

}
