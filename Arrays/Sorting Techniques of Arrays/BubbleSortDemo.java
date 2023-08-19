package com.kn.Sorting;

public class BubbleSortDemo {
	//Method called for bubble sort
	public int[] sort(int[] arr) {
		// TODO Auto-generated method stub
		//Array traversing for bubble sort
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
		//return the sorted array
		return arr;
	}

}
