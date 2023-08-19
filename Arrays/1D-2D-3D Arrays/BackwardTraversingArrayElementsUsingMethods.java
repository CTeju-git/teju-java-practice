package com.kn.arrays;

import java.util.Scanner;

public class BackwardTraversingArrayElementsUsingMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter array size");
		int size=scan.nextInt();
		//Array declaration and creation
		int[] arr=new int[size];
		int[] brr=new int[size];
		int[] crr=new int[size];
		//Array Initialization
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter element "+(i+1)+" : ");
			arr[i]=scan.nextInt();
		}
		System.out.println("Initialization is done in main method()");
		crr=copyArrToBrr(arr,brr);
		System.out.println("Array elements are as follows : ");
		for(int i=crr.length-1;i>=0;i--) {
			System.out.println(crr[i]+" ");
		}
		
		scan.close();
	}

	public static int[] copyArrToBrr(int[] arr, int[] brr) {
		// TODO Auto-generated method stub
		//Copying arr elements to brr elements
		System.out.println("------>CopyArrayElements() called");
		for(int i=0;i<arr.length;i++) {
			brr[i]=arr[i];
		}
		return brr;
	}

}
