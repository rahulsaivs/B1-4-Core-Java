package com.tns.scanner;

import java.util.Scanner;

public class Example1
{
	public static void main(String[] args) 
	{
	Scanner s=new Scanner(System.in);
	int age=s.nextInt();
	int weignt=s.nextInt();		
	if (age>16 && weignt>50)
	{
		System.out.println("Elegible to donate the blood");
	}
	else
	{
		System.out.println("Not Elegible to donate the blood");
	}
	s.close();
	}
	}

