class MethodOverloading
{
	public static void main(String[] args)
	{
		makeChai();
		makeChai(5);
		makeChai("lemon");
		makeChai("ginger",5);
	}
	static void makeChai()
	{
		System.out.println("Bill for normal chai=10");
	}
	static void makeChai(int quantity)
	{
		System.out.println("Bill for quantity based chai="+ (quantity*10));
	}
	static void makeChai(String flavour)
	{
		System.out.println("Bill for " + flavour + " chai=10");
	}
	static void makeChai(String flavour, int quantity)
	{
		System.out.println("Bill for " + flavour + " chai=" + (quantity*10));
	}
}