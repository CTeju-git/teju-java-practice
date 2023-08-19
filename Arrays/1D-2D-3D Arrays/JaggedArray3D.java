package com.kn.arrays;

import java.util.Scanner;

public class JaggedArray3D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter three values for 3 dimensions ");
		//Array declaration and creation
		System.out.println("Enter a size");
		int size=scan.nextInt();
		int[][][] arr=new int[size][][];
		for(int i=0;i<size;i++) {
			System.out.println("Enter the size for arr["+i+"]");
			int size2=scan.nextInt();
			arr[i]=new int[size2][];
		}
		
		for(int i=0;i<size;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the size for arr["+i+"]["+j+"]");
				int size2=scan.nextInt();
				arr[i][j]=new int[size2];
			}
		}
		//Array initialization of arr array
		
	    for(int i=0;i<arr.length;i++) {
	    	System.out.println("Arr["+(i)+"] inputs");
	    	for(int j=0;j<arr[i].length;j++) {
	    		System.out.println("Arr["+(i)+"]["+(j)+"] data");
	    		for(int k=0;k<arr[i][j].length;k++) {
	    			System.out.println("Enter the element"+(k+1));
	    			arr[i][j][k]=scan.nextInt();
	    		}
	    	}
	    }
	    scan.close();
	    for(int i=0;i<arr.length;i++) {
	    	System.out.println("Arr["+(i)+"] outputs");
	    	for(int j=0;j<arr[i].length;j++) {
	    		System.out.println("Arr["+(i)+"]["+(j)+"] data");
	    		for(int k=0;k<arr[i][j].length;k++) {
	    			System.out.println( " The element is : "+arr[i][j][k]);
	    		}
	    	}
	    }
	}

}
