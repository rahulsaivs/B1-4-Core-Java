package com.tns.polymorphism;

public class Renult 
{
	String colour;
	int speed;
	Renult()
	{
		System.out.println("I bought renult car 2020");
	}
	Renult (String colour,int speed)
	{
		this.colour=colour;
		this.speed=speed;
	}

	public static void main(String[] args) {
		Renult r=new Renult();
		Renult r1=new Renult("yellow" ,50);
		System.out.println(r1.colour+" "+r1.speed);
		
	}

}
