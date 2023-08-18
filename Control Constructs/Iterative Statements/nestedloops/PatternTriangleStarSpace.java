package com.kn.nestedloops;
import java.util.Scanner;
public class PatternTriangleStarSpace {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no of rows = ");
		int rows=scan.nextInt();
		scan.close();
		//for(int i=1;i<=rows;i++) {
			//for(int j=1;j<=rows+(rows-1);j++) {
				//if(j>=(rows+1)-i && j<=rows-1+i) {
					//if((i+j)%2==0){
						//System.out.print("*");
					//}
					//else
						//System.out.print(" ");
				//}
				//else
					//System.out.print(" ");
			//}
			//System.out.println(" ");
		//}
		
			//(or)
		
		int k;
		for(int i=1;i<=rows;i++) {
			k=1;
			for(int j=1;j<=rows+(rows-1);j++) {
				if(i+j>=(rows+1) && j<=rows-1+i) {
					if(k==1){
						System.out.print("*");
						k=0;
					}
					else {
						System.out.print(" ");
						k=1;
					}	
				}
				else
					System.out.print(" ");
			}
			System.out.println(" ");
		}
			
	}

}
