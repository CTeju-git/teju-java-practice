package com.kn.dowhileloop;

import java.util.Scanner;

public class ProductOfNOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int num=scan.nextInt();
		scan.close();
		int count=productOfOddNumbers(num);
		System.out.println(count);
	}

	public static int productOfOddNumbers(int num) {
		// TODO Auto-generated method stub
		int p=1,i=1,c=0;
		do {
			if(i%2!=0) {
				p=p*i;
				c++;
			}
			i++;
		}while(c<num);
		return p;
	
	}
	

}
