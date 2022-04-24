package com.tns.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Example1
{
	public static void main(String[] args)
	{
		String dbdriver=" com.mysql.cj.jdbc.Driver ";
		String dbURL="jdbc:mysql://127.0.0.1:3306/Manoj";
		String dbUserName="root";
		String dbpassword="9633";
		String query="select*from engstud";
		try 
		 {
			 Class.forName(dbdriver);
		 }
		catch(ClassNotFoundException e)
		 {
			 e.printStackTrace();
			 
		 }
		try
		 {
			 Connection  c=DriverManager.getConnection(dbURL,dbUserName,dbpassword);
			 Statement st=c.createStatement();
			 ResultSet rs=st.executeQuery(query);
		 
		while(rs.next())
		{
			String engstud=" ";
			for(int i=1;i<=2;i++)
			{
				engstud = engstud+"  "+rs.getString(i);
			}
			System.out.println(engstud);
		}
	}
		catch(SQLException e)
		{
			System.out.println("an error is occored");
		}
	}
}
		 
	


