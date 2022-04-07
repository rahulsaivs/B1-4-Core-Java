package com.tns.inheritance;
class R6
{
	void print()
	{
		System.out.println("I like R6");
	}
}
class R3 extends R6
{
void display()
	{
		System.out.println("I like R3");
	}
}
class R16 extends R3
{
	void assign()
	{
		System.out.println("I like R16");
	}
}
public class MultilevelInheritance
{

	public static void main(String[] args)
	{
		 R16 r=new R16();
		 r.display();
		 r.assign();
		 r.print();

	}

}
