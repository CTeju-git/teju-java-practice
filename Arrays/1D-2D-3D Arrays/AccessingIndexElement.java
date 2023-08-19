package com.kn.arrays;

import java.util.Scanner;

public class AccessingIndexElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array size");
		//Array declaration,creation
		int arr[]=new int[scan.nextInt()];
		accessingIndexElement(arr);
		scan.close();
	}

	public static void accessingIndexElement(int[] arr) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		//Array initialization
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the element "+(i+1)+" = ");
			arr[i]=scan.nextInt();
		}
		//Array Traversing
		System.out.println("Enter the index");
		int index=scan.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(i==index) {
				System.out.println(arr[i]);
			}
		}
		scan.close();
		
	}

}
