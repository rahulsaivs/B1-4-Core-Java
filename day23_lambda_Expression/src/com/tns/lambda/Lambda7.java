package com.tns.lambda;

public class Lambda7 {

	public static void main(String[] args)
	{
		//thread example without lambda expression
		/*Runnable r1=new Runnable()
				{

					@Override
					public void run() {
						System.out.println("Class Name is :Lambda");
					}
			
				};*/
		//thread example with lambda expression
		Runnable r1=()->
		{
			System.out.println("Class Name is :Lambda");
		};
				Thread t=new Thread(r1);
				t.start();

	}

}
