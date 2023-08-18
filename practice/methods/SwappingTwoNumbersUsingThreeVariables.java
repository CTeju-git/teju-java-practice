package methods;

import java.util.Scanner;

public class SwappingTwoNumbersUsingThreeVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number = ");
		int a=scan.nextInt();
		System.out.print("Enter another number = ");
		int b=scan.nextInt();
		System.out.println(" ----->  Before Swapping  <-----");
		System.out.println("a="+ a+" b="+b);
		System.out.println("   ");
		swapNumbers(a,b);
		scan.close();
	}

	public static void swapNumbers(int a, int b) {
		// TODO Auto-generated method stub
		int c=a;
		a=b;
		b=c;
		System.out.println(" ------->  After Swapping <------");
		System.out.println("a="+a+"  b="+b);
	}

}
