package com.kn.arrays;

import java.util.Scanner;

public class ArrayIntInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		//Array declaration
		int[] arr;
		//Array creation
		System.out.println("Enter the array size = ");
		arr=new int[scan.nextInt()];
		//Array initialization
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the element for "+(i+1));
			arr[i]=scan.nextInt();
		}
		//Array traversing
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
