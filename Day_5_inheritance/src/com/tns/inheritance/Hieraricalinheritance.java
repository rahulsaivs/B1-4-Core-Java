package com.tns.inheritance;
class cellphones
{
	void message()
	{
		System.out.println("hi,sai");
	}
	void call()
	{
		System.out.println("im calling someone");
	}
}
class samsunggalaxi31 extends cellphones
{
	void facelock()
	{
		System.out.println("modern facelook");
	}
}
class oneplus extends cellphones
{
	void games()
	{
		System.out.println("pub..g");
	}
}

public class Hieraricalinheritance
{
	public static void main(String[] args)
	{
		oneplus o=new oneplus();
		o.message();
		o.call();
		o.games();
		samsunggalaxi31  m= new samsunggalaxi31();
		m.facelock();
}
}