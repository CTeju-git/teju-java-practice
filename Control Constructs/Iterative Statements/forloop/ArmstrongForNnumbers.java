package com.kn.forloop;
import java.util.Scanner;
public class ArmstrongForNnumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number for armstrong = ");
		int n=scan.nextInt();
		int r=1,sum=0,temp=0;
		scan.close();
		armstrong(n,r,sum,temp);
	}
	public static void armstrong(int n, int r, int sum, int temp) {
		System.out.println("0");
		for(int j=1;j<=n;j++) {
			temp=j;
			for(;j>0;) {
				r=j%10;
				r=r*r*r;
				sum=sum+r;
				j=j/10;
				}
			if(temp==sum) {
				
				System.out.println(temp);
				}
			sum=0;
			j=temp;
		}
	}
}
