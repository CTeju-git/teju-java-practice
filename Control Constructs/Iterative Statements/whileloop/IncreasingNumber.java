package com.kn.whileloop;

import java.util.Scanner;

public class IncreasingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int num=scan.nextInt();
		int r,s,count=0,temp=num;
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
				if(count<2) {
					System.out.println("increasing number");
					continue;
					}
			}
			else {
				System.out.println("Not an increasing number");
				break;
			}
		}
		scan.close();
	}

}
