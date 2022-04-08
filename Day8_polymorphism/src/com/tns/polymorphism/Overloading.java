package com.tns.polymorphism;

public class Overloading {
void assign(int a,int b)
{
	System.out.println("Area of square:"+(a*a));
}
void assign(float f,float g)
{
	System.out.println(" Area of rectangle"+(f*g));
}
	
	

	public static void main(String[] args) {
		Overloading o=new Overloading();
		o.assign(5,10);
		o.assign(10f,20f);

	}

}
