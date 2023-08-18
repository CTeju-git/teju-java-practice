package com.kn.nestedloops;

import java.util.Scanner;

public class StrontioNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number = ");
		int num=scan.nextInt();
		int count=0,temp=num,a,b,c,d;
		while(num>0) {
			count++;
			num=num/10;
		}
		num=temp;
		if(count==4) {
			num=num*2;
			a=num%100;
			c=a/10;
			b=num%1000;
			d=b/100;
			if(c==d)
				System.out.println("Given number is strontio number");
			else
				System.out.println("Given number is not a strontio number");
		}
		else
			System.out.println("Invalid input for strontio numbers");
		scan.close();
	}

}
