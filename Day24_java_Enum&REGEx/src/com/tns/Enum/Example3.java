package com.tns.Enum;
enum Bike
{
	Pulser,R15,KTM,R3, honda
}
public class Example3 {

	public static void main(String[] args) {
		Bike c;
		c=Bike.KTM;
		switch(c)
		{
			case Pulser:
			System.out.println("you chouse pulser");
			break;
			case R15:
			System.out.println("you chouse ktm");
			break;
			case KTM:
			System.out.println("you chouse r3");
			break;
			default:
				System.out.println("Invalid name");
				
		}

	}

}
