import java.util.Scanner;
class CalculatorApp
{
	static void add()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 2 numbers for addition");
		int a= scan.nextInt();
		int b= scan.nextInt();
		System.out.println("Sum="+(a+b));
	}
	static void sub(int a,int b)
	{
		System.out.println("Difference="+(a-b));
	}
	static int mul()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 2 numbers for multiplication");
		int a= scan.nextInt();
		int b= scan.nextInt();
		return a*b;
	}
	static float div(int a,int b)
	{
		return a/b;
	}
	static double modulus(int a,int b)
	{
		return a%b;
	}
	static double average(int a,int b)
	{
		return (a+b)/2;
	}
	public static void main(String[] args)
	{
		
		add();

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 2 numbers for subtraction");
		int a=scan.nextInt();
		int b=scan.nextInt();
		sub(a,b);

		int product=mul();
		System.out.println("product="+product);

		System.out.println("Enter 2 numbers for division");
		int c=scan.nextInt();
		int d=scan.nextInt();
		double quotient=div(c,d);
		System.out.println("Quotient="+quotient);

		System.out.println("Enter 2 numbers for modulodivision");
		int e=scan.nextInt();
		int f=scan.nextInt();
		double modulus=modulus(e,f);
		System.out.println("modulodivision="+modulus);

		System.out.println("Enter 2 numbers for average");
		int g=scan.nextInt();
		int h=scan.nextInt();
		double average=average(g,h);
		System.out.println("Average="+average);
	}
}