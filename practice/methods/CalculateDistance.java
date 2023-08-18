package methods;

import java.util.Scanner;

public class CalculateDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a double number for speed");
		double speed=scan.nextDouble();
		System.out.println("Enter a double number for time");
		double time=scan.nextDouble();
		double distance=calculateDistance(speed,time);
		float d=(float)distance;
		System.out.println("The distance for given speed and time is ="+d);
		scan.close();
	}

	public static double calculateDistance(double speed, double time) {
		// TODO Auto-generated method stub
		return speed*time;
	}

}
