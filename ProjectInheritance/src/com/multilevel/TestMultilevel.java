package com.multilevel;
import java.util.*;
class Employee
{
	Scanner sc=new Scanner(System.in);
private int id;
private String name;
void getEmployee()
{
	
	System.out.println("Enter Id and name");
	id=sc.nextInt();
	name=sc.next();
}
void putEmployee()
{
	System.out.println(id+" "+name);
}
}
class Manager extends Employee
{
	private String department;
	void getManagerDetails()
	{
		getEmployee();
		System.out.println("Enter Department");
		department=sc.next();
	}
	void putManagerDetails()
	{
		putEmployee();
		System.out.println(department);
	}
}
class AreaManager extends Manager
{
	private String location;
	void getAreaManagerDetails()
	{
		getManagerDetails();
		System.out.println("enter Location");
		location=sc.next();
	}
	void putAreaManagerDetails()
	{
		putManagerDetails();
		System.out.println(location);
		
	}
	
	
}
public class TestMultilevel {

	public static void main(String[] args) {
		AreaManager ob=new AreaManager();
		ob.getAreaManagerDetails();
		ob.putAreaManagerDetails();
		

	}

}
