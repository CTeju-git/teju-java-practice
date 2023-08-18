package com.kn.elseifladder;

import java.util.Scanner;

public class IFelseIFvibgyor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a character=");
		char c=scan.next().charAt(0);
		scan.close();
		if(c=='v'||c=='V')
			System.out.println("Violet");
		else if(c=='i'||c=='I') 
			System.out.println("Indigo");
		else if(c=='b'||c=='B')
			System.out.println("Blue");
		else if(c=='g'||c=='G')
			System.out.println("Green");
		else if(c=='y'||c=='Y')
			System.out.println("Yellow");
		else if(c=='o'||c=='O')
			System.out.println("Orange");
		else if(c=='r'||c=='R')
			System.out.println("Red");
		else
			System.out.println("Not a VIBGYOR");
	}

}
