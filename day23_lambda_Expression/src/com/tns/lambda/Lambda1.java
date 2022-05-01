package com.tns.lambda;

interface A
{
	void show();
}
/*class says implements A
{
	public void show()
	{
		System.out.println("welcome to Ada");
	}
}*/
public class Lambda1 {

	public static void main(String[] args)
	{
		A obj=( )->
		
			{
				System.out.println("welcome to aaa");
			};
			obj.show();
		}
		
		
	}


