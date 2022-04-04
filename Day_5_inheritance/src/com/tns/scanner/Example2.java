package com.tns.scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example2 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		String Str=bf.readLine();
		System.out.println(Str);

	}

}
