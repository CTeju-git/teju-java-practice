package com.kn.arrays;

import java.util.Scanner;

public class MergeTwo1DArraysUsingMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array 1 size : ");
		int size1=scan.nextInt();
		System.out.println("Enter the array 2 size : ");
		int size2=scan.nextInt();
		//Array declaration and creation
		int[] arr=new int[size1];
		int[] brr=new int[size2];
		int[] crr=new int[size1+size2];
		//Initialization of arr array
		for(int i=0;i<size1;i++) {
			System.out.println("Enter the element "+(i+1)+" in arr array :");
			arr[i]=scan.nextInt();
		}
		//Initialization of brr array
		for(int i=0;i<size2;i++) {
			System.out.println("Enter the element "+(i+1)+" in brr array :");
			brr[i]=scan.nextInt();
		}
		//Method for merging elements
		crr=mergeTwoArrays(arr,brr,crr);
		System.out.println("The merged elements of arr and brr arrays are as follows: ");
		
//		System.out.println("First array elemets");
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
//		System.out.println(" ");
//		System.out.println("Second array elements");
//		for(int i:brr) {
//			System.out.print(i+" ");
//		}
//		System.out.println(" ");
		//Array traversing to print merged array elements
		//System.out.println("Merged elements:");
		for(int i:crr) {
			System.out.print(i+" ");
		}
		scan.close();
	}
	//Method called to merge he elements of two arrays
	public static int[] mergeTwoArrays(int[] arr, int[] brr,int[] crr) {
		// TODO Auto-generated method stub
		//merging first array elements
		for(int i=0;i<arr.length;i++) {
			crr[i]=arr[i];
		}
		int j=0;
		//Merging second array elements
		for(int i=arr.length;i<crr.length;i++) {
			crr[i]=brr[j];
			j++;
		}
		//Returning the merged array
		return crr;
	}

}
