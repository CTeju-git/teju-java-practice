package com.kn.forloop;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter a number = ");
		int a =scan.nextInt();
		int b=1;
	    int result=isFactorial(a,b);
	    System.out.println(result);
	    
		scan.close();
	}

	public static int isFactorial(int a,int b) {
		// TODO Auto-generated method stub
		for(int i=1;i<=a;i++) {
			b=b*i;
		}
		return b;
		
	}

}
