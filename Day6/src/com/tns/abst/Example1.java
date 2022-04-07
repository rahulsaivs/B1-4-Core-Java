package com.tns.abst;
abstract class Animal
{
	abstract void eat();
}
class harbivores extends Animal
{
	void eat()
	{
		System.out.println("I am vegetrian");
	}
}
class carniveres extends Animal
{
	void eat()
	{
		System.out.println("I am non-vegetrian");
	}
}

public class Example1 {

	public static void main(String[] args) {
		 harbivores h= new  harbivores();
		 carniveres c= new  carniveres();
		 h.eat();
		 c.eat();

	}

}
