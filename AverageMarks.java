package com.practice.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AverageMarks {

	public static void main(String[] args)throws SQLException
	
	{

		Connection connection = null;
		 
		  PreparedStatement prStatement = null;
		 
		  ResultSet rs = null;
		  
		  Scanner scanner = null;
		
		 try
		 {
			  scanner = new Scanner(System.in);
			 
			 Class.forName("com.mysql.cj.jdbc.Driver");
			
				
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_20","root","root");
				
				String sql = "select avg(marks) average,rollno,name,marks,DOB from student";
				
				prStatement = connection.prepareStatement(sql);

				rs = prStatement.executeQuery();		
				
				while(rs.next())
				{
					
					System.out.println("Average of marks = " + rs.getFloat(1));
					
				System.out.println(rs.getInt(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5));
					
				}
				
			 
			 
		 }
		 
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }

		  finally
		  {
			  connection.close();
			  scanner.close();
			  
		  }



	}

}
