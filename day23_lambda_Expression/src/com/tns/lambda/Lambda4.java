package com.tns.lambda;

import java.util.ArrayList;

public class Lambda4 {

	public static void main(String[] args)
	{
      ArrayList<Integer> obj= new ArrayList<>();
      obj.add(11);
      obj.add(22);
      obj.add(33);
      System.out.println(obj);
      obj.forEach((n)->
      {
    	  System.out.println(n);
       });
	}

}
