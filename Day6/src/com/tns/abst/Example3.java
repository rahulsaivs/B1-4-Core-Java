package com.tns.abst;
class A
{
	String name="rahul";
}
class B extends  A
{
	String name="sai";
	void print()
	{
	  System.out.println("Hi IAM " + name);
	  System.out.println("Hi IAM " + super.name);
	}
	
}
public class Example3 {

	public static void main(String[] args) {
		B b=new B();
		b.print();
	}

}
