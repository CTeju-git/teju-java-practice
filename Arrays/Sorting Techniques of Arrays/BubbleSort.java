package com.kn.Sorting;

import java.util.Scanner;

public class BubbleSort {

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
		scan.close();
		
		//Array elements before bubble sort
		System.out.println("---->Before bubble sort <-----");
		System.out.print("[");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.print("]");
		System.out.println();
		
		//calling method for bubble sort
		BubbleSortDemo b=new BubbleSortDemo();
		b.sort(arr);
		
		//Array elements after bubble sort
		System.out.println("---->After bubble sort <-----");
		System.out.print("[");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.print("]");
	}

}
