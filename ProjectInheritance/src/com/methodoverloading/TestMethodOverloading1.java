package com.methodoverloading;
class Shape1
{
	void area(float r)
	{
		System.out.println("Area of circle "+3.14f*r*r);
	}
	void area(double r)
	{
		System.out.println("Area of Circle Area by Circle "+3.14*r*r);
	}
	void area(int x,int y)
	{
		System.out.println("Area of Rectangle "+x*y);
	}
}
public class TestMethodOverloading1 {

	public static void main(String[] args) {
	Shape1 s=new Shape1();
	s.area(3.4f);
	s.area(3.4);
	
	
	}

}
