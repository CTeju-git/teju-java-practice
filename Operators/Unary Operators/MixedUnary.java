class MixedUnary
{	
	public static void main(String[] args)
	{
		int a=10,b=10,c=10,d=10,e=10,f,g,h,i,j;
		f=a-- + ++a - a--;
		g=b++ - b-- - b-- + b++ - --b + b++;
		h=++c + ++c * c-- - --c + --c;
		i=--d * --d + --d + d-- - d-- * d++;
		j=e++ + --e * e-- - e++;
		System.out.println(a);
		System.out.println(f);
		System.out.println(b);
		System.out.println(g);
		System.out.println(c);
		System.out.println(h);
		System.out.println(d);
		System.out.println(i);
		System.out.println(e);
		System.out.println(j);
	}
}