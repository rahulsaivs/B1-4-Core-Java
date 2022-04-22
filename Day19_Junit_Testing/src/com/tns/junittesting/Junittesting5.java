package com.tns.junittesting;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class Junittesting5 
{
	@Test
	void accept()
	{
		System.setProperty("d", null);
		Assumptions.assumeTrue("Manoj".equals(System.getProperty("1")));
	}
}
