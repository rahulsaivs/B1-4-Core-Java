package com.tnc.oops;

public class Constructer 
{
	String str;
	int s;
	Constructer()
	{
		str="welcome";
		s=123;
	}
	void display()
	{
		System.out.println(str+" "+ s);
	}

	public static void main(String[] args) 
	{
		Constructer C= new Constructer();
		C.display();

	}

}
