package practice_Problems;

import java.util.Scanner;

public class ArithmeticUsingObjects {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		Calculator c =new Calculator();
		c.add(a,b);
		c.sub(a,b);
		c.mul(a,b);
		c.div(a,b);
		c.modulus(a,b);
		scan.close();
	}
}
class Calculator{
	public void add(int a, int b) {
		int res=a+b;
		System.out.println("The sum="+res);
	}
	public void sub(int a, int b) {
		int res=a-b;
		System.out.println("The sub="+res);
	}
	public void mul(int a, int b) {
		int res=a*b;
		System.out.println("The mul="+res);
	}
	public void div(int a, int b) {
		int res=a/b;
		System.out.println("The div="+res);
	}
	public void modulus(int a, int b) {
		int res=a%b;
		System.out.println("The modulus="+res);
	}
	
}
