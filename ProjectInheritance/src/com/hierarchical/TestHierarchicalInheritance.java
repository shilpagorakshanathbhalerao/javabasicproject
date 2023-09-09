package com.hierarchical;
import java.util.*;
class Vehical
{
	Scanner sc=new Scanner(System.in);
	private String model;
	private int year;
	private String fueltype;
	public void getVehicalDetails()
	{
		System.out.println("Enter Model,Year,Fuel Type");
		model=sc.next();
		year=sc.nextInt();
		fueltype=sc.next();
	}
	public void putVehicalDetails()
	{
		System.out.println(model+" "+year+" "+fueltype);
		
	}
}
class Truck extends Vehical
{
	private double cargoCapacity;
	public void getTruckDetails()
	{
		System.out.println("Enter CargoCapacity");
		cargoCapacity=sc.nextDouble();
	}
	public void putTruckDetails()
	{
		System.out.println(cargoCapacity);
	}
}
class Car extends Vehical
{
private int seat;
public void getCarDetails()
{
	System.out.println("Enter Seats");
	seat=sc.nextInt();
}
public void putCarDetails()
{
	System.out.println(seat);
}

}
public class TestHierarchicalInheritance {

	public static void main(String[] args) 
	{
		Truck t=new Truck();
		t.getVehicalDetails();
		t.getTruckDetails();
		t.putVehicalDetails();
		t.putTruckDetails();
		Car c=new Car();
		c.getVehicalDetails();
		c.getCarDetails();
		c.putVehicalDetails();
		c.putCarDetails();

	}

}
