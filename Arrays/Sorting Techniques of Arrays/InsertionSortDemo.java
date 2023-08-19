package com.kn.Sorting;

import java.util.Scanner;

public class InsertionSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size=scan.nextInt();
		//Array declaration and creation
		int[] arr=new int[size];
		int[] crr=new int[size];
		//Array initialization
		for(int i=0;i<size;i++) {
			System.out.println("Enter element "+(i+1)+" : ");
			arr[i]=scan.nextInt();
		}
		scan.close();
		
		//Array elements before insertion sort
		System.out.println("---->Before insertion sort <-----");
		System.out.print("[");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.print("]");
		System.out.println();
		
		//calling method for insertion sort
		InsertionSort s=new InsertionSort();
		crr=s.sorted(arr);
		
		//Array elements after insertion sort
		System.out.println("---->After insertion sort <-----");
		System.out.print("[");
		for(int i:crr) {
			System.out.print(i+" ");
		}
		System.out.print("]");
		scan.close();
	}

}
