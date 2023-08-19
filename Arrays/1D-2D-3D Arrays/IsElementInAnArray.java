package com.kn.arrays;

import java.util.Scanner;

public class IsElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array size");
		//Array declaration,creation
		int arr[]=new int[scan.nextInt()];
		boolean flag=isElementInAnArray(arr);
		if(flag) {
			System.out.println("Given element in an array");
		}
		else
			System.out.println("Given element is not in an array");
		scan.close();
	}

	public static boolean isElementInAnArray(int[] arr) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		//Array initialization
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the element "+(i+1)+" = ");
			arr[i]=scan.nextInt();
		}
		scan.close();
		//Array Traversing
		System.out.println("Enter the element");
		int element=scan.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==element) {
				return true;
			}
		}
		
		return false;
	}
	

}
