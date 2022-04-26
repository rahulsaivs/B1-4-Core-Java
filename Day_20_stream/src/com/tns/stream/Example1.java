package com.tns.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example1 {

	public static void main(String[] args)
	{
		List<Integer>Values=Arrays.asList(10,20,30);
		List<Integer>Var=Values.stream().map(i->i).collect(Collectors.toList());
		System.out.println(Var);
	}

}
