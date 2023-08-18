package com.kn.dowhileloop;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a binary number = ");
		int num=scan.nextInt();
		int sum=0;
		scan.close();
		sum=binaryToDecimal(num,sum);
		System.out.println(sum);
	}

	public static int binaryToDecimal(int num,int sum) {
		// TODO Auto-generated method stub
		int r,count=1;
		 do{
			r=num%10;
			r=r*count;
			sum=sum+r;
			count*=2;
			num/=10;
		}while(num>0);
		return (sum);
	}

}
