package com.superuse;
class Employee
{
	private int id;
	private String name;
	Employee(int id,String name)
	{
	this.id=id;
	this.name=name;
	}
	void display()
	{
		System.out.println(id+" "+name);
	}
	
}
class Manager extends Employee
{
	String task;
	Manager(int id,String name,String task)
	{
	super(id,name);
	this.task=task;
	}
	void display()
	{
		super.display();
		System.out.println(task);
	}
	
}
public class TestSuperConstructor 
{

	public static void main(String[] args) 
	{
		Manager m=new Manager(101,"shilpa","management");
		m.display();

	}

}
