package com.kn.whileloop;

import java.util.Scanner;

public class LengthOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number = ");
		int num=scan.nextInt();
		int count=0;
		scan.close();
		System.out.println(lengthofnumber(num,count));
	}

	 static int lengthofnumber(int num, int count) {
		// TODO Auto-generated method stub
		 while(num>0) {
				
				count++;
				num=num/10;
			}
		 return count;
	}

}
