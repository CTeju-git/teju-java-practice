package methods;
import java.util.Scanner;
public class SemesterMarksAverage {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter your 1st semester marks:");
		int sem1=scan.nextInt();
		System.out.print("Enter your 2nd semester marks:");
		int sem2=scan.nextInt();
		System.out.print("Enter your 3rd semester marks:");
		int sem3=scan.nextInt();
		System.out.print("Enter your 4th semester marks:");
		int sem4=scan.nextInt();
		System.out.print("Enter your 5th semester marks:");
		int sem5=scan.nextInt();
		System.out.print("Enter your 6th semester marks:");
		int sem6=scan.nextInt();
		System.out.print("Enter your 7th semester marks:");
		int sem7=scan.nextInt();
		System.out.print("Enter your 8th semester marks:");
		int sem8=scan.nextInt();
		System.out.print("The average marks of given 8 semester marks is = "+calculateAverage(sem1,sem2,sem3,sem4,sem4,sem5,sem6,sem7,sem8));
		scan.close();
	}
	public static double calculateAverage(int sem1, int sem2, int sem3, int sem4, int sem42, int sem5, int sem6,
			int sem7, int sem8) {
			return (sem1+sem2+sem3+sem4+sem5+sem6+sem7+sem8)/8;
	}
}
