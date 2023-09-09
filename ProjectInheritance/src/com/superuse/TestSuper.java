package com.superuse;
class Bird
{
	String name;
	Bird()
	{
		name="Different names of Bird";
	}
	void display()
	{
		System.out.println(name);
	}
}
class Sparrow extends Bird
{
	String name;
	Sparrow()
	{
		name="Sparrow";
	}
	void display()
	{
		super.display();
		System.out.println(name);
	}
}
public class TestSuper 
{
	public static void main(String[] args) 
	{
		Sparrow s=new Sparrow();
		s.display();
		
	}

}
