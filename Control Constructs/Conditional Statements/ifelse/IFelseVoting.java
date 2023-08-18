package com.kn.ifelse;

import java.util.Scanner;

public class IFelseVoting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age");
		int age=scan.nextInt();
		scan.close();
		if(age>=18)
			System.out.println("Congrats! you are eligible for voting");
		else
			System.out.println("OOPS! you are not eligible for voting");
	}

}
