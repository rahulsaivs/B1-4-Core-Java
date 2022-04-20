package com.tns.generic;

public class Genericclass <T>
{
	T val;
	public void print()
	{
		System.out.println(val.getClass().getName());
	}

	public static void main(String[] args) {
		Genericclass<Integer>obj=new Genericclass<>();
		obj.val=15;
		obj.print();

	}

}
