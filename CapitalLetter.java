package com.kn.simpleif;

import java.util.Scanner;

public class CapitalLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an alphabet = ");
		char c=scan.next().charAt(0);
		isCapitalLetter(c);
		scan.close();
	}

	 static void  isCapitalLetter(char c) {
		// TODO Auto-generated method stub
		 if(c=='A'||c=='B'||c=='C'||c=='D'||c=='E'||c=='F'||c=='G'||c=='H'||c=='I'||c=='J'||c=='K'||c=='L'||c=='M'||c=='N'||c=='O'||c=='P'||c=='Q'||c=='R'||c=='S'||c=='T'||c=='U'||c=='V'||c=='W'||c=='X'||c=='Y'||c=='Z'){
			 System.out.println("Capital Letter");
		 }
	}

}
