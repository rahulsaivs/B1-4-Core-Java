package com.tns.recursion;

import java.util.Scanner;

public class Sum_of_digits {
	public static int sum_of_digit(int num)
    { 
        if (num == 0)
            return 0;
        return (num % 10 + sum_of_digit(num / 10));
    }
	public static void main(String[] args) 
	{
		{
	        //Take input from the user
	        //Create an instance of the Scanner Class
	        Scanner s = new Scanner(System.in);
	        System.out.println("Enter the number: ");
	        int num=s.nextInt();
	        int res=sum_of_digit(num);
	        System.out.println("The sum of digits is: "+res);
	        s.close();
	    }
	}
		

	}


