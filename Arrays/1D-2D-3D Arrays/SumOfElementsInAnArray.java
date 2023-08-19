package com.kn.arrays;

import java.util.Scanner;

public class SumOfElementsInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array size to sum the numbers");
		int[] arr=new int[scan.nextInt()];
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter the element "+(i+1)+" = ");
			arr[i]=scan.nextInt();
			sum=sum+arr[i];
		}
		System.out.println(sum);
		scan.close();
	}

}
