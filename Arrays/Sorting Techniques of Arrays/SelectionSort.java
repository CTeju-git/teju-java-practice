package com.kn.Sorting;

public class SelectionSort {
	//Method called for selection sort
	public int[] sort(int[] arr) {
		// TODO Auto-generated method stub
		int min=0;
		int temp=0,index=0;
		for(int i=0;i<arr.length-1;i++) {
			min=arr[i];
			for(int j=i+1;j<arr.length;j++) {
				if(min>arr[j]) {
					min=arr[j];
					index=j;
				}
			}
			//Swapping
			temp=min;
			arr[index]=arr[i];
			arr[i]=temp;
		}
		//My logic
//		for(int i=0;i<arr.length-1;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(min>arr[j]) {
					//Swapping
//					temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//			}
//			
//		}
		
		//returning the sorted array
		return arr;
	}

}
