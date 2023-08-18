package com.kn.nestedloops;

public class PatternRightDecreaseABCDE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i<=j)
					System.out.print((char)(64+j));
				else
					System.out.print(" ");
			}
			System.out.println(" ");
		}
	}

}
