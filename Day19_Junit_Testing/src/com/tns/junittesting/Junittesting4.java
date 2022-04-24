package com.tns.junittesting;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

public class Junittesting4 
{
	@AfterAll
    static void display()
	{
		System.out.println("Rahul");
	}
	
	
	@Test
	void display1()
	{
		System.out.println("ai");
	}

}
