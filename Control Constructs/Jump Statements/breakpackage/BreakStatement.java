package com.kn.breakpackage;

public class BreakStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		for(int i=1;i<=num;i++) {
			if(i%7==0)
				break;
			else
				System.out.println(i);
			System.out.println("Inside Loop");
		}
		System.out.println("Out of Loop");
	}

}
