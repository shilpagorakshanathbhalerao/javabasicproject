package com.methodoverloading;
class Shape
{
	void area(float r)
	{
		System.out.println("Area of circle "+3.14*r*r);
	}
	void area(int x)
	{
		System.out.println("Area of Square "+x*x);
	}
	void area(int x,int y)
	{
		System.out.println("Area of Rectangle "+x*y);
	}
}
public class TestMethodOverloading {

	public static void main(String[] args) {
	Shape s=new Shape();
	s.area(3.4f);
	s.area(3);
	s.area(3, 4);
	
	}

}
