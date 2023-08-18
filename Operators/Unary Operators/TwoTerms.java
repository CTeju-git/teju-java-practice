class TwoTerms
{	
	public static void main(String[] args)
	{
		int a=10,b=10,c=10,d=10,e,f,g,h;
		e=++a + ++a;
		f=b++ + b++;
		g=--c + --c;
		h=d-- + d--;
		System.out.println(a);
		System.out.println(e);
		System.out.println(b);
		System.out.println(f);
		System.out.println(c);
		System.out.println(g);
		System.out.println(d);
		System.out.println(h);
	}
}