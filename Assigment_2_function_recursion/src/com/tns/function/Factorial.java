package com.tns.function;

import java.util.Scanner;

public class Factorial
{

		static int factioral(int n)
		{
			int fact=1;
			for(int i=1;i<=n;i++)
			{
				fact=  fact * i;
			}
			return fact;
		}

		public static void main(String[] args)
		{
			Scanner s=new Scanner(System.in);
			int n=s.nextInt();
			System.out.println(factioral(n));
			s.close();
			
			
	}

}
