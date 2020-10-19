package com.practice.jdbc;
 
import java.sql.*;

public class SelectRecord {

	public static void main(String[] args) throws SQLException {
		
		Connection connection = null;
		
		Statement statement = null;
		
	    
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_20","root","root");
			
			String sql = "select * from student";
			
			statement = connection.createStatement();
			
			ResultSet resultSet = statement.executeQuery(sql);
			
			
			while(resultSet.next())
			{
				
				System.out.println(resultSet.getInt(1)+" " + resultSet.getString(2)+" "+resultSet.getInt(3)
				+" "+resultSet.getString(4));
				
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
