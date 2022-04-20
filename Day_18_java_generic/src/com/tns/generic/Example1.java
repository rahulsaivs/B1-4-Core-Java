package com.tns.generic;

import java.util.ArrayList;
import java.util.Iterator;

public class Example1 {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("Rahul");
		a.add("sai");
		//a.add(20);
		String s=a.get(1);
		Iterator<String> itr=a.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
				

	}

}
