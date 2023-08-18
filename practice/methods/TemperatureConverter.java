package methods;

import java.util.Scanner;

public class TemperatureConverter {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the temperature in fahrenheit");
		double F=scan.nextDouble();
		
		System.out.println("The conversion of fahrenheit into celsiusis ="+ temperatureConverter(F));
		scan.close();
	}
	public static double temperatureConverter(double F) {
		// TODO Auto-generated method stub
		double C=((F-32)*5)/9;
		return C;
	}
}
