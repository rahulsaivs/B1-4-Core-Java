package com.tns.inheritance;

 class Parent 
{
		  void print()
		{
			System.out.println("Hello this is rahul");
		}
		

	}
class child extends Parent 
{
 void display()
	{
		System.out.println("Singleinheritance");
	}

}
class Singleinheritance
{
	public static void main (String[] args)
	{
		child c=new child();
		c.display();
		c.print();
	}
}
