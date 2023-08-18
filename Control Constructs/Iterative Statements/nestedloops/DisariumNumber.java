package com.kn.nestedloops;

import java.util.Scanner;

public class DisariumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter a number = ");
		int num=scan.nextInt();
		int count=0,temp=num,r,sum=1,total=0;
		while(num>0) {
			count++;
			num=num/10;
		}
		num=temp;
		int c=count;
		while(num>0) {
			r=num%10;
			while(count>0) {
				sum=sum*r;
				count--;
			}
			total=total+sum;
			num=num/10;
			
			c--;
			count=c;
			sum=1;
		}
		if(temp==total) {
			System.out.println(temp+" is Disarium number ");
		}
		else
			System.out.println(temp +" Not a Disarium number ");
		scan.close();
	}

}
