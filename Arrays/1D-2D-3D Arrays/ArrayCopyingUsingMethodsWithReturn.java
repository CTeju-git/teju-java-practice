package com.kn.arrays;


import java.util.Scanner;

public class ArrayCopyingUsingMethodsWithReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter array size");
		int size=scan.nextInt();
		//Array declaration and creation
		int[] arr=new int[size];
		int[] brr=new int[size];
		//Array Initialization
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter element "+(i+1)+" : ");
			arr[i]=scan.nextInt();
		}
		System.out.println("Initialization is done in main method()");
		//Method Calling for copying elements
		brr=copyArrToBrr(arr,brr);
		System.out.println("Array elements are as follows : ");
		//Forward Traversing
		for(int i=0;i<arr.length;i++) {
			System.out.println(brr[i]+" ");
		}
		//Backward Traversing
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(brr[i]+" ");
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
