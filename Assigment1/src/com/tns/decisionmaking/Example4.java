package com.tns.decisionmaking;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) 
	{
		
		//switchcase
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		switch(a)
		{
		case 1:
			System.out.println("rahul");
			break;
		case 2 :
			System.out.println("hello");
			break;
		case 3:
			System.out.println("theis");
			break;
			default:
				System.out.println("invalid input");
		}
		
	}

}
