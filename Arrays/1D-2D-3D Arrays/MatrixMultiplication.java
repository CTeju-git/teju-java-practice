package com.kn.arrays;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		//Array declaration and creation
		System.out.println("Enter two values for 2 dimensions ");
		int[][] arr=new int[scan.nextInt()][scan.nextInt()];
		int[][] brr=new int[arr.length][arr[0].length];
		//Array initialization of arr array
		System.out.println("Inputs for arr array :");
	    for(int i=0;i<arr.length;i++) {
	    	System.out.println("Inputs for "+(i+1)+" :");
	    	for(int j=0;j<arr[i].length;j++) {
	    		System.out.println("Enter the element "+(j+1));
	    		arr[i][j]=scan.nextInt();
	    	}
	    }
	    System.out.println(" ");
	  //Array initialization of brr array
	    System.out.println("Inputs for brr array : ");
	    for(int i=0;i<arr.length;i++) {
	    	System.out.println("Inputs for "+(i+1)+" : ");
	    	for(int j=0;j<arr[i].length;j++) {
	    		System.out.println("Enter the element "+(j+1));
	    		brr[i][j]=scan.nextInt();
	    	}
	    }
	    System.out.println(" ");
	    matrixMultiplication(arr,brr);
	    scan.close();
	    
	}
	public static void matrixMultiplication(int[][] arr, int[][] brr) {
		// TODO Auto-generated method stub
		//Array crr declaration and creation
		int[][] crr=new int[4][1];
		//Array multiplication of elements
		System.out.println("Multiplication of 2D Arrays");
		int sum=0;
		for(int i=0;i<2;i++) {
			for(int j=0;j<4;j++) {
				System.out.println(arr[i][j]+"*"+brr[j][i]);
	    		crr[i][j]=arr[i][j]*brr[j][i];
	    		sum=sum+crr[i][j];
	    	}
			System.out.println(sum);
			sum=0;
	    }
	}

}
