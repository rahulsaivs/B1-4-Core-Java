package com.tns.Enum;
interface Pizza
{
	public void print();
}
enum size implements Pizza
{
	small,medium,large,extralarge;
	public void print()
	{
		System.out.println("Size is: "+this);
	}
}
public class Example4 {

	public static void main(String[] args) {
		size.medium.print();
		
		

	}

}
