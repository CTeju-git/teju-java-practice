package com.kn.Sorting;

public class InsertionSort {
	//method called for insertion sort
	public int[] sorted(int[] arr) {
		// TODO Auto-generated method stub
		int temp=0;
		//Array traversing for sorting
		for(int i=1;i<arr.length;i++) {
			temp=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>temp) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
		//returning sorted array
		return arr;
	}

}
