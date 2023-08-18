package com.kn.forloop;

import java.util.Scanner;

public class FactorsOfAgivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a number = ");
		int a=scan.nextInt();
		System.out.println("Factors of a given number are = ");
		for(int i=1;i<=a;i++) {
			if(a%i==0)
				System.out.println(i);
		}
		scan.close();
	}

}
