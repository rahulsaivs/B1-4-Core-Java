package com.tns.annotations;
class Parent1
{
	void print()
	{
		System.out.println(" Hey guys!");
	}
	@Deprecated
	void print1()
	{
		System.out.println(" comeon!");
	}
}
public class Example3 {

	public static void main(String[] args) {
		Parent1 p=new Parent1();
		p.print1();

	}

}
