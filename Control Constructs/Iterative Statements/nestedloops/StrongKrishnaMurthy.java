package com.kn.nestedloops;

import java.util.Scanner;

public class StrongKrishnaMurthy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number = ");
		int num =scan.nextInt();
		int r,sum=1,total=0;
		int temp=num;
		while(num>0) {
			r=num%10;
			for(int i=1;i<=r;i++) {
				sum=sum*i;
			}
			total=total+sum;
			sum=1;
			num=num/10;
			scan.close();
		}
		if(temp==total)
			System.out.println("Given number is strong/krishnamurthy/peterson number");
		else
			System.out.println("Given number is not a  strong/krishnamurthy/peterson number");
	
	}

}
