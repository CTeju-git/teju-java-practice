package com.kn.nestedloops;

public class PatternLeftIncrease11111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(j<=i)
					System.out.print(6-i);
				else
					System.out.print(" ");
			}
			System.out.println(" ");
		}
	}

}
