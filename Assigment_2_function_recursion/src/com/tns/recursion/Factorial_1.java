package com.tns.recursion;

import java.util.Scanner;

public class Factorial_1 
{
	 static int factioral(int n)
	{
		if(n==1)
			return 1;
		else
			return n*factioral(n-1); 
	}
		

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(factioral(n));
		s.close();
		
	}

}
