package com.tns.exception;

import java.io.IOException;

public class Example6 
{
void myMethod(int num)throws IOException,
ClassNotFoundException{

if(num==1)

throw new IOException("IOException Occurred");

else

throw new
ClassNotFoundException("ClassNotFoundException");

}
public static void main(String args[]){

try{

Example6 obj=new Example6();

obj.myMethod(1);

}

catch(Exception ex){

System.out.println(ex);

}

}
}
