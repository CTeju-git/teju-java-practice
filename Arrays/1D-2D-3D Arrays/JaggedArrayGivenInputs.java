package com.kn.arrays;

public class JaggedArrayGivenInputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array declaration and creation
		int[][] arr=new int[2][];
		arr[0]=new int[4];
		arr[1]=new int[2];
		//Array Initialization
		int k=10;
		for(int i=0;i<2;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=k;
				k+=10;
			}
		}
		//Array Traversing
		for(int i=0;i<2;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println(arr[i][j]);
			}
		}
	}

}
