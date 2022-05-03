package com.tns.crud;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CrudDB {

	public static void main(String[] args)
	{
		String dbURL="jdbc:mysql://127.0.0.1:3306/sample";
		String dbUserName="root";
		String dbpassword="9633";
		try 
		{
		 
		    Connection c = DriverManager.getConnection(dbURL, dbUserName, dbpassword);
		 
		    String sql = "INSERT INTO Employee (user_ID,user_name, password, , email) VALUES (?, ?, ?, ?)";
		    
		    PreparedStatement p = c.prepareStatement(sql);
		    p.setString(1, "bill");
		    p.setString(2, "secretpass");
		    p.setString(3, "Bill Gates");
		    p.setString(4, "bill.gates@microsoft.com");
		    int row = p.executeUpdate();
		    if (row > 0) {
		        System.out.println("A new user was inserted successfully!");
		    }
		    c.close();
		}
		catch (SQLException e) 
		{
		    e.printStackTrace();
		}
		
	}

}
		     