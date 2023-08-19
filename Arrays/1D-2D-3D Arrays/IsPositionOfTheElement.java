package com.kn.arrays;

import java.util.Scanner;

public class IsPositionOfTheElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array size");
		//Array declaration,creation
		int arr[]=new int[scan.nextInt()];
		//Array initialization
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the element "+(i+1)+" = ");
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the element");
		int element=scan.nextInt();
		int position=isElementInAnArray(arr,element);
		if(position==-1) {
			System.out.println("The element "+element+" is not found");
		}
		else {
			System.out.println("The position of the element "+element+" is : "+position);
		}
		scan.close();
	
	}

	public static int isElementInAnArray(int[] arr,int element) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		//Array Traversing
		
		int position=-1;
		boolean isFound=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==element) {
				isFound=true;
				position=++i;
				break;
			}
//			else {
//				if(i==(arr.length-1))
//					System.out.println("Element is not found in array ");
//			}
		}
		scan.close();
		if(isFound==true) {
			return position;
		}
		return -1;
	}

}
