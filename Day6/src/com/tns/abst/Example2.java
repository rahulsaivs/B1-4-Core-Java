package com.tns.abst;
class example11
{
	final void display()
	{
		System.out.println("Hello students");
	}
}

public class Example2 extends example11  
{
	
	void eat()
	{
		System.out.println("Welcome to c2tc");
	}

	public static void main(String[] args)
	{
		
		 Example2 e= new   Example2();
		 e.display();

	}

}
