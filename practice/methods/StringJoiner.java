package methods;

import java.util.Scanner;

public class StringJoiner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter your first name ");
		String firstName=scan.nextLine();
		System.out.println("Enter your middle name ");
		String middleName=scan.nextLine();
		System.out.println("Enter your last name ");
		String lastName=scan.nextLine();
		String fullName=joinStrings(firstName,middleName,lastName);
		System.out.println("The full name is ="+fullName);
		scan.close();
		
	}

	public static String joinStrings(String firstName, String middleName, String lastName) {
		// TODO Auto-generated method stub
		return firstName+" "+middleName+" "+lastName;
		
		
	}

}
