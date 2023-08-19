package com.kn.arrays;

import java.util.Scanner;

public class BinarySearchForPositionOfElementOfAscendingOrderArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size=scan.nextInt();
		//Array declaration and creation
		int[] arr=new int[size];
		//Array Initialization
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
	private static int positionOfTheElement(int[] arr, int element) {
		// TODO Auto-generated method stub
		int low=0,mid=0,position=-1;
		int high=arr.length-1;
		boolean isElementFound=false;
		//Array Traversing
		while(low<=high) {
			mid=(low+high)/2;
			if(element==arr[mid]) {
				position=mid+1;
				isElementFound=true;
				break;
			}
			else if(element>arr[mid]) {
				low=mid+1;
				//high=high;
			}
			else {
				//low=low;
				high=mid-1;
			}
		}
		//Checking whether the element is found or not
		if(isElementFound==false) {
			System.out.println("Element "+element +" is not found");
		}
		else{
			return position;
		}
		return 0;
	}

}
