package com.kn.forloop;

import java.util.Scanner;

public class EvenNumbersTillN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter n value = ");
		int n=scan.nextInt();
		evenNumbers(n);
		scan.close();
	}

	public static void evenNumbers(int n) {
		// TODO Auto-generated method stub
		for(int i=1;i<=n;i++) {
			if(i%2==0)
				System.out.print(i+" ");
		}
	}

}
