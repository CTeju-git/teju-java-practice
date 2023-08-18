package com.kn.elseifladder;
import java.util.Scanner;
public class SelectedCourses {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter your cgpa in B.Tech = ");
			double points=scan.nextDouble();
			if(points>=90)
				System.out.println("Go for Masters in Artificial Intelligence");
			else if(points<90 && points>=75)
				System.out.println("Go for IoT ");
			else if(points>=60 && points<75)
				System.out.println("Go for Neural Networks");
			else if(points >=45 && points<60)
				System.out.println("Go for Quantum Computing");
			else
				System.out.println("Go for IT Job");
			scan.close();
		}

	

}
