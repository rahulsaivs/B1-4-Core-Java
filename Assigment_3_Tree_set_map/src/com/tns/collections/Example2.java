package com.tns.collections;

import java.util.ArrayDeque;

public class Example2 {

	public static void main(String[] args) {
		ArrayDeque a=new ArrayDeque();
		a.add(11);
		a.add("hello");
		System.out.println(a);
		a.addFirst("hello");
		a.addLast(12);
		System.out.println(a);
		
	}

}
