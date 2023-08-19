package com.kn.arrays;

import java.util.Scanner;

public class EvenOrOddElementsInAnArrayUsingMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array size for even numbers");
		//Array declaration and creation
		int[] arr=new int[scan.nextInt()];
		//Array initialization
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter the element "+(i+1)+" = ");
			arr[i]=scan.nextInt();
		}
		//Calling method for even or odd 
		evenOrOddElements(arr);
		scan.close();
	}
	//Method to find whether the given elements is even or odd 
	public static void evenOrOddElements(int[] arr) {
		// TODO Auto-generated method stub
		//Array Traversing 
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println("Even element = "+arr[i]);
			}
			else {
				System.out.println("Odd element = "+arr[i]);
			}
		}
		
	}

}
