package com.practice.jdbc;
import java.sql.*;
import java.util.Scanner;

public class SerachBY {

	public static void main(String[] args) throws SQLException
	
	{

		  Connection connection = null;
			 
		  PreparedStatement prStatement = null;
		 
		  ResultSet rs = null;
		  
		  Scanner scanner = null;
		
		 try
		 {
			  scanner = new Scanner(System.in);
			 
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 
			  System.out.println("Enter rollno to be search");
			  
			  int rollno = scanner.nextInt();
				
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_20","root","root");
				
				String sql = "select * from student where rollno = ?";
				
				prStatement = connection.prepareStatement(sql);
				
				prStatement.setInt(1, rollno);

				rs = prStatement.executeQuery();		
				
				while(rs.next())
				{
					
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
					
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
