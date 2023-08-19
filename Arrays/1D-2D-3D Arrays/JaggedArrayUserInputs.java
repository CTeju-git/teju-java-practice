package com.kn.arrays;

import java.util.Scanner;

public class JaggedArrayUserInputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the 1-D size");
		int size=scan.nextInt();
		//Array declaration and creation
		int[][] arr=new int[size][];
		for(int i=0;i<size;i++) {
			System.out.println("Enter 2-d size");
			arr[i]=new int[scan.nextInt()];
		}
		//Array initialization
		for(int i=0;i<size;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the value");
				arr[i][j]=scan.nextInt();
			}
		}
		//Array Traversing
		for(int i=0;i<size;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println(arr[i][j]);
			}
		}
		scan.close();
	}

}
