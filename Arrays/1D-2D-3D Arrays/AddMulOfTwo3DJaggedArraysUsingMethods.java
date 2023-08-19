package com.kn.arrays;

import java.util.Scanner;

public class AddMulOfTwo3DJaggedArraysUsingMethods{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		//Array declaration and creation
		System.out.println("Enter  dimension 1 size");
		int size=scan.nextInt();
		int[][][] arr=new int[size][][];
		int[][][] brr=new int[size][][];
		int[][][] crr=new int[size][][];
		for(int i=0;i<size;i++) {
			System.out.println("Enter size "+(i+1)+" of dimension 1");
			int size2=scan.nextInt();
			arr[i]=new int[size2][];
			brr[i]=new int[size2][];
			crr[i]=new int[size2][];
		}
		
		for(int i=0;i<size;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter size "+(j+1)+" of dimension 2");
				int size3=scan.nextInt();
				arr[i][j]=new int[size3];
				brr[i][j]=new int[size3];
				crr[i][j]=new int[size3];
			}
		}
		//Array initialization of arr array
		System.out.println("Inputs for arr array :");
	    for(int i=0;i<arr.length;i++) {
	    	System.out.println("Arr["+(i+1)+"] inputs");
	    	for(int j=0;j<arr[i].length;j++) {
	    		System.out.println("Arr["+(i)+"]["+(j)+"] data");
	    		for(int k=0;k<arr[i][j].length;k++) {
	    			System.out.println("Enter the element"+(k+1));
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
	    		System.out.println("Brr["+(i)+"]["+(j)+"] data");
	    		for(int k=0;k<arr[i][j].length;k++) {
	    			System.out.println("Enter the element"+(k+1));
	    			brr[i][j][k]=scan.nextInt();
	    		}
	    	}
	    }
	    System.out.println(" ");
	    
	    //Methods for sum and product of arr and brr arrays
	    findTwo3DArrayElementSum(arr,brr,crr);
	    findTwo3DArrayElementProduct(arr,brr,crr);
	    scan.close();
	}

	public static void findTwo3DArrayElementProduct(int[][][] arr, int[][][] brr, int[][][] crr) {
		// TODO Auto-generated method stub
		
		//Array multiplication of elements
		System.out.println("Multiplication of 3D Arrays");
		for(int i=0;i<arr.length;i++) {
	    	for(int j=0;j<arr[i].length;j++) {
	    		for(int k=0;k<arr[i][j].length;k++) {
	    			crr[i][j][k]=arr[i][j][k]*brr[i][j][k];
	    			System.out.println("arr["+i+"]["+j+"]["+k+"] * brr["+i+"]["+j+"]["+k+"] = "+crr[i][j][k]);
	    		}
	    	}
	    }
		
		
	}

	public static void findTwo3DArrayElementSum(int[][][] arr, int[][][] brr, int[][][] crr) {
		// TODO Auto-generated method stub
		//Array addition of elements
		System.out.println("Addition of 3D Arrays");
		for(int i=0;i<arr.length;i++) {
	    	for(int j=0;j<arr[i].length;j++) {
	    		for(int k=0;k<arr[i][j].length;k++) {
	    			crr[i][j][k]=arr[i][j][k]+brr[i][j][k];
	    			System.out.println("arr["+i+"]["+j+"]["+k+"] + brr["+i+"]["+j+"]["+k+"] = "+crr[i][j][k]);
	    		}
	    	}
	    }
		System.out.println(" ");
	}
	

}
