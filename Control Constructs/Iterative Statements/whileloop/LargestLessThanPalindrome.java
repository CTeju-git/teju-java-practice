package com.kn.whileloop;

import java.util.Scanner;

public class LargestLessThanPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a digit for palindrome = ");
		int num=scan.nextInt();
		int temp=num,sum=0,r=0;
		palindrome(num,sum,r,temp);
		scan.close();
	}
	public static void palindrome(int num, int sum, int r, int temp) {
		// TODO Auto-generated method stub
		for(;num>0;) {
			r=num%10;
			sum=sum*10+r;
			num=num/10;
		}
		if(sum==temp)
			System.out.println(temp-1);
		else
			System.out.println("Not a palindrome");
		
		
	}

}
