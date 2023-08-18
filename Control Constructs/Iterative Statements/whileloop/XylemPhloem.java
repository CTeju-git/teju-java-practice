package com.kn.whileloop;

import java.util.Scanner;

public class XylemPhloem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int num=scan.nextInt();
		scan.close();
		int r,s=1,count=0,c,a,sum=0,temp=num;
		while(num>0) {
			count++;
			num=num/10;
		}
		c=count;
		num=temp;
		r=num%10;
		while(count>1) {
			s=s*10;
			count--;
		}
		s=num/s;
		r=r+s;
		num=num/10;
		c=c-2;
		count=c;
		while(count>0) {
			a=num%10;
			sum=sum+a;
			num=num/10;
			count--;
		}
		if(r==sum) {
			System.out.println("Xylem Number");
		}
		else {
			System.out.println("Phloem Number");
		}
		
	}

}
