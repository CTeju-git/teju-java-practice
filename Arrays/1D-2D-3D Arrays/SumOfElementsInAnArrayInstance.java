package com.kn.arrays;

public class SumOfElementsInAnArrayInstance {

	public int sum(int[] arr) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		return sum;
	}

}
