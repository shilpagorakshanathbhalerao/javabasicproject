package com.aggregation;
class Customer
{
	private int id;
	private String name;
	private Orders order;
	Customer(int id,String name,Orders order)
	{
		this.id=id;
		this.name=name;
		this.order=order;
	}
	public String toString()
	{
		return id+" "+name+" "+order;
	}
}
class Orders
{
	private int orderId;
	private String orderName;
	Orders(int orderId,String orderName)
	{
		this.orderId=orderId;
		this.orderName=orderName;
		
	}
	public String toString()
	{
		return orderId+" "+orderName;
	}
	
}
public class TestAggregation {

	public static void main(String[] args) {
		Orders order=new Orders(101,"Fodd order");
		Customer customer=new Customer(1,"Ajay",order);
		System.out.println(customer);

	}

}