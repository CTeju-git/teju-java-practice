package com.kn.nestedloops;

public class PatternLeftDecreaseStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i+j<=6)
					System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
//for(int i=1;i<=5;i++) {
//for(int j=1;6>=i+j;j++) {
	//System.out.print("*");
//}
//System.out.println(" ");
//}
