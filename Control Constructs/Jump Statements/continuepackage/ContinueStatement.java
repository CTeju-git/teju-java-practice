package com.kn.continuepackage;

public class ContinueStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		for(int i=1;i<=num;i++) {
			if(i%2==0) {
				continue;
			}
			System.out.println(i+ " -Inside Loop");
		}
		System.out.println("Out of the loop");
	}

}
