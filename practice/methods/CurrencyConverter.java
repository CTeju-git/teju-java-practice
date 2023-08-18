package methods;
import java.util.Scanner;

public class CurrencyConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter currency in indian rupees = ");
		double inr=scan.nextDouble();
		System.out.println("Conversion of INR into dollar = "+dollarConverter(inr));
		System.out.println("Conversion of INR into pound = "+poundConverter(inr));
		scan.close();
	}

	public static double poundConverter(double inr) {
		// TODO Auto-generated method stub
		return inr*0.0095;
	}

	public static double dollarConverter(double inr) {
		// TODO Auto-generated method stub
		return inr*0.0121;
	}

}
