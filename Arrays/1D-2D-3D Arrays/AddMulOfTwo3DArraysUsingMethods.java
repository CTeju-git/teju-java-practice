package com.kn.arrays;

import java.util.Scanner;

public class AddMulOfTwo3DArraysUsingMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter three values for 3 dimensions ");
		//Array declaration and creation
		int[][][] arr=new int[scan.nextInt()][scan.nextInt()][scan.nextInt()];
		int[][][] brr=new int[arr.length][arr[0].length][arr[0][0].length];
		
		//Array initialization of arr array
		System.out.println("Inputs for arr array :");
	    for(int i=0;i<arr.length;i++) {
	    	System.out.println("Arr["+(i+1)+"] inputs");
	    	for(int j=0;j<arr[i].length;j++) {
	    		System.out.println("j="+(j+1));
	    		for(int k=0;k<arr[i][j].length;k++) {
	    			System.out.println("k="+(k+1));
	    			arr[i][j][k]=scan.nextInt();
	    		}
	    	}
	    }
	    System.out.println(" ");
	    
	    //Array initialization of brr array
	    System.out.println("Inputs for brr array :");
	    for(int i=0;i<arr.length;i++) {
	    	System.out.println("Brr["+(i+1)+"] inputs");
	    	for(int j=0;j<arr[i].length;j++) {
	    		System.out.println("j="+(j+1));
	    		for(int k=0;k<arr[i][j].length;k++) {
	    			System.out.println("j="+(j+1));
	    			brr[i][j][k]=scan.nextInt();
	    		}
	    	}
	    }
	    System.out.println(" ");
	    
	    //Methods for sum and product of arr and brr arrays
	    findTwo3DArrayElementSum(arr,brr);
	    findTwo3DArrayElementProduct(arr,brr);
	    scan.close();
	}

	public static void findTwo3DArrayElementProduct(int[][][] arr, int[][][] brr) {
		// TODO Auto-generated method stub
		//Array crr declaration and creation
		int[][][] crr=new int[arr.length][arr[0].length][arr[0][0].length];
		
		//Array multiplication of elements
		System.out.println("Multiplication of 2D Arrays");
		for(int i=0;i<arr.length;i++) {
	    	for(int j=0;j<arr[i].length;j++) {
	    		for(int k=0;k<arr[i][j].length;k++) {
	    			crr[i][j][k]=arr[i][j][k]*brr[i][j][k];
	    		}
	    	}
	    }
		
		//Array Traversing to print product of array elements
		for(int i=0;i<arr.length;i++) {
	    	for(int j=0;j<arr[i].length;j++) {
	    		for(int k=0;k<arr[i][j].length;k++) {
	    			System.out.println("arr["+i+"]["+j+"]["+k+"] * brr["+i+"]["+j+"]["+k+"] = "+crr[i][j][k]);
	    		}
	    	}
	    }
	}

	public static void findTwo3DArrayElementSum(int[][][] arr, int[][][] brr) {
		// TODO Auto-generated method stub
		//Array crr declaration and creation
		int[][][] crr=new int[arr.length][arr[0].length][arr[0][0].length];
		
		//Array addition of elements
		System.out.println("Addition of 2D Arrays");
		for(int i=0;i<arr.length;i++) {
	    	for(int j=0;j<arr[i].length;j++) {
	    		for(int k=0;k<arr[i][j].length;k++) {
	    			crr[i][j][k]=arr[i][j][k]+brr[i][j][k];
	    		}
	    	}
	    }
		
		//Array Traversing to print sum of array elements
		for(int i=0;i<arr.length;i++) {
	    	for(int j=0;j<arr[i].length;j++) {
	    		for(int k=0;k<arr[i][j].length;k++) {
	    			System.out.println("arr["+i+"]["+j+"]["+k+"]+ brr["+i+"]["+j+"]["+k+"] = "+crr[i][j][k]);
	    		}
	    	}
	    }
		System.out.println(" ");
	}

}
