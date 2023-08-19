package com.kn.arrays;

import java.util.Scanner;

public class PositionOfTheElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array size");
		//Array declaration,creation
		int arr[]=new int[scan.nextInt()];
		//Method calling for position of an element
		positionOfTheElement(arr);
		scan.close();
	}

	public static void positionOfTheElement(int[] arr) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		//Array initialization
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the element "+(i+1)+" = ");
			arr[i]=scan.nextInt();
		}
		
		//Array Traversing
		System.out.println("Enter the element");
		int element=scan.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==element) {
				System.out.println("The position of the element is : "+(i+1));
				break;
			}
			else {
				if(i==(arr.length-1))
					System.out.println("Element is not found in array ");
			}
		}
		scan.close();
		
	}

}
