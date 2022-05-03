package com.tns.interface1;


class Main implements Example1
{
	public void display()
	{
		System.out.println("hey bro,whats going on");
	}
	public static void main(String args[])
	{
		Main m=new Main();
		m.display();
	}
}

