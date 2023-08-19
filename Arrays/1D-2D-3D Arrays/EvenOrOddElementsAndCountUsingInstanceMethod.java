package com.kn.arrays;

import java.util.Scanner;

public class EvenOrOddElementsAndCountUsingInstanceMethod {

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
		scan.close();
		//Objects Creation
		PrintEvenOrOddElementsDemo printEvenOrOddElements=new PrintEvenOrOddElementsDemo();
		//Calling method for even or odd
		printEvenOrOddElements.evenOrOddElementsDemo(arr);
		System.out.println("######################");
		//Calling method for even or odd count
		printEvenOrOddElements.evenOrOddCount(arr);
	}
}
