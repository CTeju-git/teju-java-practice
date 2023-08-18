package com.kn.elseifladder;
import java.util.Scanner;
public class LowerUpperCharacterSymbols {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a character = ");
		char c =scan.next().charAt(0);
		isLowerUpper(c);
		scan.close();
	}
	 static void isLowerUpper(char c) {
		// TODO Auto-generated method stub
		if(c=='B'||c=='C'||c=='D'||c=='F'||c=='G'||c=='H'||c=='J'||c=='K'||c=='L'||c=='M'||c=='N'||c=='P'||c=='Q'||c=='R'||c=='S'||c=='T'||c=='V'||c=='W'||c=='X'||c=='Y'||c=='Z')
			System.out.println("Upper case consonants");
		else if(c=='a'||c=='b'||c=='c'||c=='d'||c=='f'||c=='g'||c=='h'||c=='j'||c=='k'||c=='l'||c=='m'||c=='n'||c=='p'||c=='q'||c=='r'||c=='s'||c=='t'||c=='v'||c=='w'||c=='x'||c=='y'||c=='z')
			System.out.println("Lower case consonants");
		else if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
			System.out.println("Upper case vowels");
		else if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			System.out.println("Lower case vowels");
		else if(c=='0'||c=='1'||c=='2'||c=='3'||c=='4'||c=='5'||c=='6'||c=='7'||c=='8'||c=='9')
			System.out.println("Digit");
		else
			System.out.println("Special Character");
	}
}
