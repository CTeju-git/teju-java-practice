package com.kn.arrays;

import java.util.Scanner;

public class JaggedArrayFriendsName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the 1-D size");
		int size=scan.nextInt();
		//Array declaration and creation
		String[][] arr=new String[size][];
		for(int i=0;i<size;i++) {
			System.out.println("Enter 2-d size");
			arr[i]=new String[scan.nextInt()];
		}
		//Array initialization
		for(int i=0;i<size;i++) {
			System.out.println("A"+(i+1)+" class friends :");
			System.out.println("I have "+ arr[i].length+" friends");
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the "+(j+1)+" friend name");
				arr[i][j]=scan.next();
			}
			System.out.println(" ");
		}
		//Array Traversing
		for(int i=0;i<size;i++) {
			System.out.println("A"+(i+1)+" class friends :");
			for(int j=0;j<arr[i].length;j++) {
				System.out.println((j+1)+". "+arr[i][j]);
			}
			System.out.println(" ");
			
			
		}
		scan.close();
	}

}
