package com.tns.package3;

public class Sbi
{
	private int balance;
	public Sbi(int bal)
	{
		balance=bal;
	}
	public void display()
	{
		System.out.println(balance);
	}
	public static void main(String args[])
	{
		Sbi s=new Sbi(45000);
		s.display();
		
	}



	

}
