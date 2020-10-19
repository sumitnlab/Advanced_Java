package com.practice.jdbc;
import java.sql.*;

public class SortData {

	public static void main(String[] args) throws SQLException
	
	{

		  Connection connection = null;
		 
		  PreparedStatement prStatement = null;
		 
		  ResultSet rs = null;
		
		 try
		 {
			 
			 Class.forName("com.mysql.cj.jdbc.Driver");
				
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_20","root","root");
				
				String sql = "select * from student order by name Asc";
				
				prStatement = connection.prepareStatement(sql);
				
				rs= prStatement.executeQuery(sql);
				
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
			  
		  }

	}

}
