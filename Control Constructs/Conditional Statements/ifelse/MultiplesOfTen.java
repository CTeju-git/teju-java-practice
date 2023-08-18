package com.kn.ifelse;

import java.util.Scanner;

public class MultiplesOfTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number = ");
		int num=scan.nextInt();
		boolean flag=isMultipleOfTen(num);
		scan.close();
		if(flag)
			System.out.println("Multiple of ten");
		else
			System.out.println("Not a multiple of ten");
	}

	 static boolean isMultipleOfTen(int num) {
		// TODO Auto-generated method stub
		 if(num%10==0)
			 return true;
		 else
			 return false;
	}

}
