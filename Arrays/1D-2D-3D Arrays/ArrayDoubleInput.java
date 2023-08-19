package com.kn.arrays;

import java.util.Scanner;

public class ArrayDoubleInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[] arr;
		System.out.println("Enter the array size = ");
		arr=new double[scan.nextInt()];
		//int k=10;
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the element for "+(i+1));
			arr[i]=scan.nextDouble();
			//arr[i]=k;
			//k=k+10;
		}
		//forward traversing
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		//reverse traversing
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
		scan.close();
	}

}
