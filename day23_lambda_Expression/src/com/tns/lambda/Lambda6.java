package com.tns.lambda;
interface D
{
	int Null(int x,int y);
}
public class Lambda6 {

	public static void main(String[] args)
	{
		D obj=(x,y)->(x+y);
		System.out.println(obj.Null(20, 30));

	}

}
