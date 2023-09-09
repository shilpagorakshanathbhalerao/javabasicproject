package com.inheritance;
class A
{
	int i=10;
}
class B extends A
{
int b=20;	
}
public class TestInhertance {

	public static void main(String[] args) 
	{
		A a=new B();
		System.out.println(a.i);
		
		

	}

}
