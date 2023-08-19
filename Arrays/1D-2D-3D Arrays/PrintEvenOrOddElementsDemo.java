package com.kn.arrays;

public class PrintEvenOrOddElementsDemo {
	 void evenOrOddElementsDemo(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println("Given number is even");
			}
			else {
				System.out.println("Given number is odd");
			}
		}
	 }
	 void evenOrOddCount(int[] arr) {
		 int evenCount=0,oddCount=0;
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]%2==0) {
					evenCount++;
				}
				else {
					oddCount++;
				}
		 }
		 System.out.println("Total number of EVEN Elements : "+evenCount);
		 System.out.println("Total number of ODD Elements : "+oddCount);
	 }
}
