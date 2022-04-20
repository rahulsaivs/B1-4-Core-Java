package com.tns.generic;

public class Generinmethod
{
	public static <E>void print(E[]Eelements)
	{
		for(E itr :Eelements)
		{
			System.out.println(itr);
		}
	}

	public static void main(String[] args) {
		Integer[] arr= {11,33,55};
		Character[] arr1= {'w','e','h'};
		print(arr);
		print(arr1);
		
	}

}
