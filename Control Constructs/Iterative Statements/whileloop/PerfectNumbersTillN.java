
package com.kn.whileloop;

import java.util.Scanner;

public class PerfectNumbersTillN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int n=scan.nextInt();
		int r=0,temp=1,sum=0;
		scan.close();
		perfectNumbers(n,r,temp,sum);
	}

	public static void perfectNumbers(int n, int r, int temp, int sum) {
		// TODO Auto-generated method stub
		int num=1;
		int a=1;
		while(a<=n) {
			temp=a;
			while(num<=a/2) {
				if(a%num==0) {
					sum=sum+num;
				}
				num++;
			}
			if(temp==sum) {
				System.out.println(temp);
			}
			a=temp;
			a++;
			sum=0;
			num=1;
		}
		
	}

}
