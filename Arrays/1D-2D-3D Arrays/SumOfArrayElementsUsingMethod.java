package com.kn.arrays;

import java.util.Scanner;

public class SumOfArrayElementsUsingMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array size to sum the numbers");
		//Array declaration and creation
		int[] arr=new int[scan.nextInt()];
		System.out.print("The sum of all elements in an array : "+sumOfElementsInAnArray(arr));
		scan.close();
	}

	public static int sumOfElementsInAnArray(int[] arr){
		// TODO Auto-generated method stub
		int sum=0;
		Scanner scan = new Scanner(System.in);
		//array initialization
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the element "+(i+1)+" = ");
			arr[i]=scan.nextInt();
			sum=sum+arr[i];
		}
		scan.close();
		return sum;
		
	}

}
