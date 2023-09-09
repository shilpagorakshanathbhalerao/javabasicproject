package com.methodoverloading;
class Addition
{
	void sum(int x,long y)
	{
	System.out.println("First "+x+" "+y+":"+(x+y));
	}
	void sum(long y,int x)
	{
	System.out.println("Second "+x+" "+y+":"+(x+y));
	}
	void sum(int x,int y)
	{
	System.out.println("Third "+x+" "+y+":"+(x+y));
	}
	void sum(int x,int y,int z)
	{
	System.out.println("Fourth "+x+" "+y+" "+z+":"+(x+y+z));
	}
	void sum(long x,long y,long z)
	{
	System.out.println("Fifth "+x+" "+y+" "+z+":"+(x+y+z));
	}
}
public class TestMethodOverloading2 {

	public static void main(String[] args) 
	{
		Addition ob=new Addition();
		ob.sum(23, 24l);
		ob.sum(24l, 23);
		ob.sum(23, 24);
		ob.sum(23, 24, 25);
		ob.sum(23l, 24l, 25l);
	}

}
