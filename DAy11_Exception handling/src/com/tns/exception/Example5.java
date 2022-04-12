package com.tns.exception;

public class Example5 
{
	static void display(int age,int weight)
	{
		if (age>18 && weight>40)
		{
			System.out.println("your elegible to dontate blood");
		}
		else
		{
			throw new ArithmeticException("NOT ELEGIBLE");
		}
		
	}

	public static void main(String[] args)
	{
		display(16,55);
		System.out.println("Exception handled");
		

	}

}
