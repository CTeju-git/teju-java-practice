package com.kn.arrays;

import java.util.Scanner;

public class SumOfElementsInArrayUsingInstanceMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array size to add the elements");
		//Array declaration and creation
		int[] arr=new int[scan.nextInt()];
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter the element "+(i+1)+" = ");
			arr[i]=scan.nextInt();
		}
		//Objects Creation
		SumOfElementsInAnArrayInstance s=new SumOfElementsInAnArrayInstance();
		System.out.println(s.sum(arr));
		scan.close();
	}

	

}

