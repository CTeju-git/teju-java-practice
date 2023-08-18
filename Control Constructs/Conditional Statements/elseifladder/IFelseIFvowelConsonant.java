package com.kn.elseifladder;

import java.util.Scanner;

public class IFelseIFvowelConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a character");
		char c =scan.next().charAt(0);
		scan.close();
		if(c=='a'||c=='A')
			System.out.println("Given character is vowel");
		else if(c=='e'||c=='E') 
			System.out.println("Given character is vowel");
		else if(c=='i'||c=='I')
			System.out.println("Given character is vowel");
		else if(c=='o'||c=='O')
			System.out.println("Given character is vowel");
		else if(c=='u'||c=='U')
			System.out.println("Given character is vowel");
		else
			System.out.println("Given number is consonant");
			
	}

}
