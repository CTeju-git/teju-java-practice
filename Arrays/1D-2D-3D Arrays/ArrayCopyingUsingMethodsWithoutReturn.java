package com.kn.arrays;

import java.util.Scanner;

public class ArrayCopyingUsingMethodsWithoutReturn {

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
		copyArrToBrr(arr,brr);
		scan.close();
	}

	public static void copyArrToBrr(int[] arr, int[] brr) {
		// TODO Auto-generated method stub
		//Copying arr elements to brr elements
		for(int i=0;i<arr.length;i++) {
			System.out.println("Element "+(i+1)+" in brr array is : ");
			brr[i]=arr[i];
			System.out.println(brr[i]);
		}
	}

}
