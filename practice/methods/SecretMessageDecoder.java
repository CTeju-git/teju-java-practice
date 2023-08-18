package methods;

import java.util.Scanner;

public class SecretMessageDecoder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the character= ");
		char c=scan.next().charAt(0);
		System.out.println("The decoded message is ="+decodeCharacter(c));
		scan.close();

	}

	public static int decodeCharacter(char c) {
		// TODO Auto-generated method stub
		return c;
	}

}
