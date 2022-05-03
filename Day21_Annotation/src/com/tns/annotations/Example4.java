package com.tns.annotations;

import java.lang.reflect.Method;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation1 {
     int Print();
     
   
}
class Parent2
{
	@MyAnnotation1(Print = 25)
	public void display()
	{
		System.out.println("Welcome to annotation");
	}
}
class Example4
{
	public static void main(String[]args) throws Exception
	{
		Parent2 p=new Parent2();
		Method m=p.getClass().getMethod("display");
		MyAnnotation1 a=m.getAnnotation(MyAnnotation1.class);
		System.out.println(a.Print());
	}
}