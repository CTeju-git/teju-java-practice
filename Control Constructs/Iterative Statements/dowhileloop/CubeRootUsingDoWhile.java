package com.kn.dowhileloop;

import java.util.Scanner;

public class CubeRootUsingDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int num=scan.nextInt();
		scan.close();
		double root=cubeRoot(num);
		System.out.println(root);
	}

	public static double cubeRoot(int num) {
		// TODO Auto-generated method stub
		double i=0,square=0;;
		do {
			i++;
			square=i*i;
		}while(square!=num);
		return i;
	}

}
