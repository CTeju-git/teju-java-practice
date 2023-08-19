package com.kn.arrays;

public class JaggedArrayDirectValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array declaration and creation
		int[][] arr=new int[2][];
		arr[0]=new int[4];
		arr[1]=new int[2];
		
		//Array Initialization
		arr[0][0]=10;
		arr[0][1]=20;
		arr[0][2]=30;
		arr[0][3]=40;
		arr[1][0]=50;
		arr[1][1]=60;
		
		//Array Traversing
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[0][2]);
		System.out.println(arr[0][3]);
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
		
	}

}
