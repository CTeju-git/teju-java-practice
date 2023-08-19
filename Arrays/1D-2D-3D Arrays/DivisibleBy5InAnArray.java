package com.kn.arrays;

import java.util.Scanner;

public class DivisibleBy5InAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array size for checking divibility of 5");
		int[] arr=new int[scan.nextInt()];
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter the element "+(i+1)+" = ");
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%5==0) {
				System.out.println(arr[i]);
			}
		}
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]%5==0) {
				System.out.println(arr[i]);
			}
		}
		
		scan.close();
	}

}
