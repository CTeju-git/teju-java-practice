package com.kn.forloop;
import java.util.Scanner;
public class Garage {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter no of elements in a garage = ");
		int m=scan.nextInt();
		int total = 0,max_revenue=-1;
		for(int i=0;i<m;i++) {
				System.out.println("enter no of bikes");
				int bikes=scan.nextInt();
				System.out.println("enter no of cars");
				int cars=scan.nextInt();
				System.out.println("enter no of trucks");
				int trucks=scan.nextInt();
				bikes*=100;
				cars*=250;
				trucks*=500;
				total=bikes+cars+trucks;
				if(total>max_revenue) {
					max_revenue=total;
				}
		}
		System.out.println(max_revenue);
		scan.close();
	}
}
