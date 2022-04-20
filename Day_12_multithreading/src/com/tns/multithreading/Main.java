package com.tns.multithreading;
class exam extends Thread
{
    public void run() 
    { 
    	System.out.println("thread passed");
    }
}
public class Main
{

	public static void main(String[] args)
	{
		exam creat=new exam();
		creat.start();
		//creat.start();
		
		

	}

}
