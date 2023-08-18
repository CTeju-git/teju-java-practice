package com.kn.forloop;

import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter a number = ");
		int num=scan.nextInt();
		int temp=num,sum=0,r=0;
		boolean palindrome =palindrome(num,sum,r,temp);
		if(palindrome)
			System.out.println("Given number is a palindrome ");
		else
			System.out.println("Given number is not a palindrome ");
		scan.close();	
	}

	public static boolean palindrome(int num, int sum, int r, int temp) {
		// TODO Auto-generated method stub
		for(;num>0;) {
			r=num%10;
			sum=sum*10+r;
			num=num/10;
		}
		if(sum==temp)
			return true;
		else
			return false;
		
	}

}
