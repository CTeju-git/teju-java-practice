package com.kn.arrays;

import java.util.Scanner;

public class Array3DIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter three values for 3 dimensions ");
		//Array declaration and creation
		int[][][] arr=new int[scan.nextInt()][scan.nextInt()][scan.nextInt()];
		
		//Array initialization of arr array
		System.out.println("Inputs for arr array :");
	    for(int i=0;i<arr.length;i++) {
	    	for(int j=0;j<arr[i].length;j++) {
	    		for(int k=0;k<arr[i][j].length;k++) {
	    			arr[i][j][k]=scan.nextInt();
	    		}
	    	}
	    }
	    System.out.println("Array elements are : ");
	    for(int i=0;i<arr.length;i++) {
	    	for(int j=0;j<arr[i].length;j++) {
	    		for(int k=0;k<arr[i][j].length;k++) {
	    			System.out.println(arr[i][j][k]+" ");
	    		}
	    	}
	    }
	    scan.close();
	}  
}
