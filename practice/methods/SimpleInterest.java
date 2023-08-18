
package methods;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the value for principle=");
		double p=scan.nextDouble();
		System.out.print("Enter the value for time=");
		double t=scan.nextDouble();
		System.out.print("Enter the value for rate of interest=");
		double r=scan.nextDouble();
		System.out.println("The simple interest for the given values is = "+simpleInterest(p,t,r));
		scan.close();
	}

	public static double simpleInterest(double p, double t, double r) {
		// TODO Auto-generated method stub
		return (p*t*r)/100;
	}

}
