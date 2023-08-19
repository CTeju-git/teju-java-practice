package com.kn.arrays;

import java.util.Scanner;

public class AdditionOfTwoArraysUsingMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the array  size : ");
		int size=scan.nextInt();
		//Array declaration and creation
		int[] arr=new int[size];
		int[] brr=new int[size];
		int[] crr=new int[size];
		//Array inputs for arr array
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the "+(i+1)+" value for arr : ");
			arr[i]=scan.nextInt();
		}
		//Array inputs for brr array
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the "+(i+1)+" value for brr : ");
			brr[i]=scan.nextInt();
		}
		scan.close();
		//Method calling for sum of elements in two arrays
		 crr=findTwo1DArrayElementSum(arr,brr,crr);
		//Array traversing for added array
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr["+i+"]+brr["+i+"] = "+crr[i]);
		}
		
	}
	//Method called to add two arrays
	public static int[] findTwo1DArrayElementSum(int[] arr,int[] brr, int[] crr) {
		// TODO Auto-generated method stub
		
		System.out.println("--------Add elements-----------");
		System.out.println("The sum of values in arr and brr arrays are : ");
		//Adding the elements of arr and brr arrays
		for(int i=0;i<arr.length;i++) {
			crr[i]=arr[i]+brr[i];
		}
		return crr;
	}

}
