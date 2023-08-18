package com.kn.elseifladder;
import java.util.Scanner;
public class Quadrant {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the x-axis value = " );
		int x=scan.nextInt();
		System.out.print("Enter the y-axis value = " );
		int y=scan.nextInt();
		quadrantCoordinates(x,y);
		scan.close();
	}
	 static void quadrantCoordinates(int x, int y) {
		if(x>0 && y>0)
			System.out.println("Quadrant -1 ");
		else if(x<0 && y>0)
			System.out.println("Quadrant -2 ");
		else if(x<0 && y<0)
			System.out.println("Quadrant -3 ");
		else if(x>0 && y<0)
			System.out.println("Quadrant -4 ");
		else if(x==0 && y==0) 
			System.out.println("Origin ");
		else
			System.out.println("Lies on x or y axis");
	}
}
