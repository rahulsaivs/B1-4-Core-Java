package com.tnc.oops;

public class Nonparameterized {

	

	String str;
	int a;
	Nonparameterized()
	{
		str="welcome";
		a=123;
	}
	void display()
	{
		System.out.println(str+" "+ a);
	}

	public static void main(String[] args) 
	{
		Nonparameterized C= new Nonparameterized();
		C.display();

	}

}
