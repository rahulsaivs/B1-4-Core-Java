package com.tnc.operators;

public class logicaloperator {

	public static void main(String[] args) 
	{
		int a=3 ,b=4;
	 boolean r = (a<b && b<8);
	 boolean r1 =(a<b || b<8);
	 boolean r2=!(a<b);
		{
			System.out.println(r);
			System.out.println(r1);
			System.out.println(r2);
		}

	}

}
