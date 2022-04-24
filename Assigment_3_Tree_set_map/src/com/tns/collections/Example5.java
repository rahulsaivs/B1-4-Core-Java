package com.tns.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Example5 {

	public static void main(String[] args) 
	{
		NavigableMap<Integer,String> s=new TreeMap<Integer,String>();
		
		s.put(23,"Rahul");
		s.put(8,null);
		System.out.println(s);
		System.out.println(s.lastEntry());




	}

}
