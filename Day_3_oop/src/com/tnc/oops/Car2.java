package com.tnc.oops;
public class Car2 
{
	String str;
	Car2(String s)
	{
		str= s;
	}
	void print()
	{
		System.out.println("this is"+ str);
	}
	public static void main(String[] args)
	{
		Car2 a= new Car2(" AUDI");
		Car2 a1=new Car2(" BMW");
		Car2 a2=new Car2(" MARCIDES BENZ");
		a.print();
		a1.print();
		a2.print();	
	}

}
