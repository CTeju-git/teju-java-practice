package com.kn.arrays;

import java.util.Scanner;

public class BinarySearchForPositionOfElementOfAnyOrderArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size=scan.nextInt();
		//Array declaration and creation
		int[] arr=new int[size];
		//Array initialization
		for(int i=0;i<size;i++) {
			System.out.println("Enter element "+(i+1)+" : ");
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the element : ");
		int element=scan.nextInt();
		//Method calling for position
		int position=positionOfTheElement(arr,element);
		System.out.println("Element "+element+" is found and the position is : "+position);
		scan.close();
	}
		//Method called for position
	public static int positionOfTheElement(int[] arr, int element) {
		int low=0;
		int high=arr.length-1;
		int mid=(low+high)/2;
		boolean isElementFound=false;
		if(element==arr[mid]) {
			return (mid+1);
		}
		for(int i=mid+1;i<=high;i++) {
			if(element==arr[i]) {
				return (i+1);
			}
		}
		for(int i=0;i<mid-1;i++) {
			if(element==arr[i]) {
				return (i+1);
			}
		}
		if(isElementFound==false) {
			System.out.println("Element not found ");
		}
		
	return 0;
	}
}
