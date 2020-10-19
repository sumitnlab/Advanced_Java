package com.practice.jdbc;
import java.sql.*;
import java.util.Scanner;

public class CountCoulmns {

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
				
				String sql = "select count(*) FROM information_schema.columns  where table_schema = 'jdbc_20'"
						+ "and  table_name = 'student'";
				
				prStatement = connection.prepareStatement(sql);

				rs = prStatement.executeQuery();		
				
				while(rs.next())
				{
					System.out.println( "Number od columns in table are =  " +rs.getInt(1));
					
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
