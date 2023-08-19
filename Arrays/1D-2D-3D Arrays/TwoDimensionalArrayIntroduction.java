package com.kn.arrays;

import java.util.Scanner;

public class TwoDimensionalArrayIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of students = ");
		int size1=scan.nextInt();
		System.out.println("Enter the no of subjects per student = ");
		int size2=scan.nextInt();
		int[][] arr=new int[size1][size2];
		for(int i=0;i<size1;i++) {
			System.out.println("Enter student "+(i+1)+" data : ");
			for (int j=0;j<size2;j++) {
				System.out.println("Enter subject "+(j+1)+" marks = ");
				arr[i][j]=scan.nextInt();
			}
			System.out.println(" ");
		}
		System.out.println("****************");
		for(int i=0;i<arr.length;i++) {
			System.out.println("Student "+(i+1)+" data : ");
			for (int j=0;j<arr[i].length;j++) {
				System.out.println("Subject "+(j+1)+" marks = "+arr[i][j]);
			}
			System.out.println(" ");
		}
		scan.close();
	}

}
