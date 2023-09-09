package com.singledlevelinheritance;
class Shape
{
	double getPerimeter()
	{
	return 0.0;	
	}
	double getArea()
	{
		return 0.0;
	}
}
class Circle extends Shape
{
	double radius;
	Circle(double radius)
	{
		this.radius=radius;
	}
	double getPerimeter()
	{
		return 2*3.14*radius*radius;
	}
	double getArea()
	{
		return 3.14*radius*radius;
	}
	
}
public class TestSingledInheritance {

	public static void main(String[] args) 
	{
		Circle ob=new Circle(2.0);
		System.out.println("Perimeter of Circle="+ob.getPerimeter());
		System.out.println("Area of Circle="+ob.getArea());

	}

}
