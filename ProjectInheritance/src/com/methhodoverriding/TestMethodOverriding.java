package com.methhodoverriding;
import java.util.*;
class Vehicle
{
	private String name="Tata vehicle";
	void display()
	{
		System.out.println(name);
	}
}
class Car extends Vehicle
{
	private String name="Tata nano";
	void display()
	{
		System.out.println(name);
	}
}
public class TestMethodOverriding 
{

	public static void main(String[] args) 
	{
		Car c=new Car();
		c.display();
		
		Vehicle v=new Vehicle();
		v.display();
	}
	
	

}
