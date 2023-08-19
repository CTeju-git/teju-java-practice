package com.kn.Sorting;

import java.util.Scanner;

public class MaxMinNumberWithSorting {

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
		System.out.println("---->Before bubble sort <-----");
		System.out.print("[");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.print("]");
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			int temp=0,count=0;
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					count++;
				}
			}
			if(count==0) {
				break;
			}
		}
		System.out.println("---->After bubble sort <-----");
		System.out.print("[");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println("]");
		for(int i=0;i<arr.length;i++) {
			if(i==0) {
				System.out.println(arr[i]);
			}
			if(i==arr.length-1) {
				System.out.println(arr[arr.length-1]);
				break;
			}
			
		}
	}

}
