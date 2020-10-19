package com.practice.jdbc;
import java.sql.*;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.time.*;

public class InsertRecord {

	public static void main(String[] args) throws SQLException {
		
		Connection connection = null;
		
		PreparedStatement prStatement = null;
		
		Scanner scanner = new Scanner(System.in);
		
		try
		{
			

			   System.out.println("Enter rollno");
			   
			   int rollno = scanner.nextInt();
			   
			   System.out.println("Enter name");
			   
			   String name = scanner.next();
			   
			   System.out.println("Enter marks");
			   
			   int marks = scanner.nextInt();
			   
			   System.out.println("Enter DOB");
			   
			   String Date1 = scanner.next();
			
			
			 Class.forName("com.mysql.cj.jdbc.Driver");
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_20","root","root");
			
		   String sql = "insert into student values(?,?,?,?)";
		   
		   prStatement = connection.prepareStatement(sql);
		   
		   prStatement.setInt(1, rollno);
		   
		   prStatement.setString(2, name);
		   
		   prStatement.setInt(3, marks);
		   
		    prStatement.setString(4,Date1);
		   
		   int count = prStatement.executeUpdate();
		   
		   if(count>0)
		   {
			   System.out.println("Record Inserted");
		   }

		   else
		   {
			   System.out.println("Something wrong happened");
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
