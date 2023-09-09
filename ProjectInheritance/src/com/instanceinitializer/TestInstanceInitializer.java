package com.instanceinitializer;
class Bike
{
	int speed;
	Bike()
	{
		System.out.println("Default Constructor"+speed);
	}
	{
		speed=100;
		System.out.println("Instance Initializer Block"+speed);
	}
}
public class TestInstanceInitializer {

	public static void main(String[] args) 
	{
	Bike b=new Bike();	

	}

}
