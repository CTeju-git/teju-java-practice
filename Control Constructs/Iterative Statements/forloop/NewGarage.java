package com.kn.forloop;
import java.util.Scanner;
public class NewGarage {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter no of elements in a garage = ");
		int m=scan.nextInt();
		int revenue = 0,max_revenue=-1;
		int[][] g=new int[m][3];
		for(int i=0;i<m;i++) {
			for(int j=0;j<3;j++) {
				System.out.print("enter count of vehicles= ");
				g[i][j]=scan.nextInt();
			}
			g[i][0]*=100;
			g[i][1]*=250;
			g[i][2]*=500;
			revenue=g[i][0]+g[i][1]+g[i][2];
			System.out.println("Garage total = "+revenue);
			System.out.println(" ");
			if(revenue>max_revenue) {
					max_revenue=revenue;
			}
		}
		System.out.println("The maximum value is = "+max_revenue);
		scan.close();
	}

}
