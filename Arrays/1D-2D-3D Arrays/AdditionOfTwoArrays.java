package com.kn.arrays;

import java.util.Scanner;

public class AdditionOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the array  size : ");
		int size1=scan.nextInt();
		//Array declaration and creation
		int[] arr=new int[size1];
		int[] brr=new int[size1];
		int[] crr=new int[size1];
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
		//Array traversing to add the elements of arr and brr arrays
		System.out.println("The sum of values in arr and brr arrays are : ");
		for(int i=0;i<arr.length;i++) {
			crr[i]=arr[i]+brr[i];
			System.out.println("arr["+i+"]+brr["+i+"] = "+crr[i]);
		}
		scan.close();
		
	}

}
