package com.india.regex;

import java.util.regex.Pattern;

public class Example1 {

	public static void main(String[] args) {
		String pattern="Rahul sai";
		String input="Rahul sai";
		boolean Result =Pattern.matches(pattern, input);
		System.out.println(Result);

	}

}
