package com.kn.nestedloops;

public class PatternEDCBA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=1;j--) {
				System.out.print((char)(64+j));
			}
			System.out.println(" ");
		}
	}

}
