package com.kn.elseifladder;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int num=scan.nextInt();
		if(num%5==0 && num%3==0) {
			System.out.println("FizzBuzz");
		}
		else if (num%5==0) {
			System.out.println("Buzz");
		}
		else if( num%3==0) {
			System.out.println("Fizz");
		}
		else if(num%5!=0 && num%3!=0) 
			System.out.println(num+" is not divisible by 3 and 5");
		scan.close();
	}

}
