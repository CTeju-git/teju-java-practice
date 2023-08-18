package com.kn.whileloop;

import java.util.Scanner;

public class BouncyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int num=scan.nextInt();
		int r,s,t=0,u=0,count=0,temp=num;
		while(num>0) {
			count++;
			num=num/10;
		}
		num=temp;
		while(count>1) {
			r=num%10;
			num=num/10;
			s=num%10;
			count--;
			if(r-s>0) {
				t++;
				continue;
			}
			else if(r-s<0) {
				u++;
				continue;
			}
			else {
				System.out.println("Not a Bouncy number");
				break;
			}
		}
		if(t==0||u==0) {
			System.out.println("Not a Bouncy Number");
		}
		else {
			System.out.println("Bouncy number");
		}
		scan.close();
	}

}
