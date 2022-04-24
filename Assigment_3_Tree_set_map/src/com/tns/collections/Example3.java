package com.tns.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Example3 {

	public static void main(String[] args) {
		Set a= new LinkedHashSet();
		a.add(11);
		a.add(null);
		System.out.println(a);

	}

}
