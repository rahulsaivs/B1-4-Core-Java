package com.tns.annotations;

import java.util.ArrayList;

public class Example2 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayList a=new ArrayList();
		a.add(10);
		a.add("Rahul");
		System.out.println(a);

	}

}
