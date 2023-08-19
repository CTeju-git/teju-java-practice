package com.kn.Sorting;

import java.util.Scanner;

public class MaxMinNumberWithoutSorting {

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
		int max1=-2147483648;
		int min1=2147483647;
		int max2=max1;
		int min2=min1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max1) {
				max2=max1;
				max1=arr[i];
			}
			if(arr[i]<min1) {
				min2=min1;
				min1=arr[i];
				
			}
		}
		
		
		System.out.println("Max1 = "+max1);
		System.out.println("Min1 = "+min1);
		System.out.println("Max2 = "+max2);
		System.out.println("Min2 = "+min2);
	}

}
