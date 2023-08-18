package com.kn.forloop;

import java.util.Scanner;

public class PrimeNumbersTillNterms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number for n prime numbers = ");
		int n=scan.nextInt();
		primeNumbers(n);
		scan.close();
	}

	public static void primeNumbers(int n) {
		// TODO Auto-generated method stub
		int i=2;
		int count=0;
		int c=0;
		for(;c<n;) {
			for(int j=1;j<=i;j++) {
				if(i%j==0)
					count++;
			}
			if(count==2) {
				System.out.print(i+" ");
				c++;
			}
			i++;
			
			count=0;
		}
	}

}
