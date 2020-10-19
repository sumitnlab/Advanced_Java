package com.practice.jdbc;

import java.sql.*;

public class CreateTable {

	public static void main(String[] args) throws SQLException
	
	{

		System.out.println("********Create the table************");
		
		Connection connection = null;
		
		Statement statement = null;
		
	    
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_20","root","root");
			
			String sql = "create table student(rollno int(4),name varchar(20),marks int(5),DOB date)";
			
			statement = connection.createStatement();
			
			statement.executeUpdate(sql);
			
			if(statement!= null)
			{
				System.out.println("Table is created");
			}
	
			
			
		}
		
		catch(Exception e)
		{
			
			System.out.println(e);
			
		}
		
		finally
		
		{
			
			connection.close();
			
		}
		
		


	}

}
