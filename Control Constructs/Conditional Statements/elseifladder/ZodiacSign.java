package com.kn.elseifladder;
import java.util.Scanner;
public class ZodiacSign {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your month of birth  =" );
		int month=scan.nextInt();
		System.out.println("Enter your Date of birth  =" );
		int date=scan.nextInt();
		dateOfBirth(month,date);
		scan.close();
	}
	 static void dateOfBirth(int month,int date) {
		if(month==1) {
			if(date>=01 && date<=19)
				System.out.println("Capricon");
			else if(date>=20 && date<=31)
				System.out.println("Aquarius");
		}else if(month==2) {
			if(date>=01 && date<=18)
				System.out.println("Aquarius");
			else if(date>=19 && date<=29)
				System.out.println("Pisces");
		}
		else if(month==3) {
			if(date>=01 && date<=20)
				System.out.println("Pisces");
			else if(date>=21 && date<=31)
				System.out.println("Aries");
		}
		else if(month==4) {
			if(date>=01 && date<=19)
				System.out.println("Aries");
			else if(date>=20 && date<=30)
				System.out.println("Taurus");
		}
		else if(month==5) {
			if(date>=01 && date<=20)
				System.out.println("Taurus");
			else if(date>=21 && date<=31)
				System.out.println("Gemini");
		}
		else if(month==6) {
			if(date>=01 && date<=20)
				System.out.println("Gemini");
			else if(date>=21 && date<=30)
				System.out.println("Cancer");
		}
		else if(month==7) {
			if(date>=01 && date<=22)
				System.out.println("Cancer");
			else if(date>=23 && date<=31)
				System.out.println("Leo");
		}
		else if(month==8) {
			if(date>=01 && date<=22)
				System.out.println("Leo");
			else if(date>=23 && date<=31)
				System.out.println("Virgo");
		}
		else if(month==9) {
			if(date>=01 && date<=22)
				System.out.println("Virgo");
			else if(date>=23 && date<=30)
				System.out.println("libra");
		}
		else if(month==10) {
			if(date>=01 && date<=22)
				System.out.println("Libra");
			else if(date>=23 && date<=31)
				System.out.println("Scorpio");
		}
		else if(month==11) {
			if(date>=01 && date<=21)
				System.out.println("Scarpio");
			else if(date>=22 && date<=30)
				System.out.println("Sagittarius");
		}
		else if(month==12) {
			if(date>=01 && date<=21)
				System.out.println("Sagittarius");
			else if(date>=22 && date<=31)
				System.out.println("Capricon");
		}
		else
			System.out.println("Invalid month");

	}

}
