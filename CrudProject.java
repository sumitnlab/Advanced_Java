package com.jdbc;
import java.util.*;
import java.io.IOException;
import java.sql.*;

public class CrudProject {

	public static void main(String[] args) throws IOException, SQLException
	{
		
		
		Scanner scanner = new Scanner(System.in);
		
		int id = 0;
		int age = 0;
		
		String name = null,address = null;
		
		String ch = "yes";
		
		Connection connection = null;
		
		PreparedStatement pst = null;
		
		ResultSet rs = null;
		
	
		
		System.out.println("1.Insert Record");
		System.out.println("2.Select Rrecord");
		System.out.println("3.Update record");
		System.out.println("4.Delete Record");
		System.out.println("5.Exit");
	
		System.out.println("Enter your choice");
		
		int choice = scanner.nextInt();
		
		try
		  {

	    	Class.forName("com.mysql.cj.jdbc.Driver");
	    	
	    	connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud","root","root");
			
			  switch(choice)
			  {
			  
			    case 1:
			    
			    
			    	 System.out.println("Enter your id");
			    	 
			    	 id=scanner.nextInt();
			    	 
			    	 System.out.println("Enter your name");
			    	 
			    	 name = scanner.next();
			    	 
			    	 System.out.println("Enter your address");
			    	
			    	 address = scanner.next();
			    	 
			    	 System.out.println("Enter your age");
			    	 
			    	 age = scanner.nextInt();
			    	 
			    	 
			    	 String sql = "insert into emp_details values(?,?,?,?)";
			    	 
			    	 pst = connection.prepareStatement(sql);
			    	 
			    	 pst.setInt(1, id);
			    	 pst.setString(2,name);
			    	 pst.setString(3,address);
			    	 pst.setInt(4, age);
			    	 
			    	 int count = pst.executeUpdate();
			    	 
			    	 if(count>0)
			    	 {
			    		 System.out.println("Record Inserted");
			    	 }
			    	 else
			    	 {
			    		 System.out.println("Something wrong happened");
			    	 }
			    	 
			    	   break;
			    	 
			    case 2:
			    	
			    	 String select = "select * from emp_details";
			    	 
			    	 
                     pst = connection.prepareStatement(select);
                     
                     rs = pst.executeQuery();

			    	  
			    	  while(rs.next())
			    	  {
			    		  System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+ " "+rs.getInt(4));  
			    	  }
			    	  
			    	  break;
			    	 
			    	  
			    case 3:
			    	
			    	System.out.println("Enter new name = ");
			    	
			    	String col = scanner.next();
			    	
			    	System.out.println("Enter where clause = ");
			    	
			    	int where = scanner.nextInt();
			  
			    	String updatesql = "update emp_details set name = ? where id = ? ";
			    	
			    	pst = connection.prepareStatement(updatesql);
			    	
			    
			    	
			    	pst.setString(1, col);
			    	
			    	pst.setInt(2, where);
			    	
			    	int i = pst.executeUpdate();
			    	
			    	if(i>0)
			    	{
			    		System.out.println("Table updated");
			    	}
			    	else
			    	{
			    		System.out.println("Something went wrong");
			    	}
			    	
			    	  break;
			    	
			    case 4:
			    	
			    	String delete1 ="delete  from emp_details where id = ?";
			    	
			    	System.out.println("Enter the id  = ");
			    	
			    	int id1 = scanner.nextInt();
			    	
			    	pst = connection.prepareStatement(delete1);
			    	
			    	pst.setInt(1,id1);
			    	
			    	int counter = pst.executeUpdate();
			    	
			    	if(counter>=0)
			    	{
			    		System.out.println("Record deleted");
			    	}
			    	else
			    	{
			    		System.out.println("Something wrong happend");
			    	}
			    	
			    	break;
			    	
			    case 5:
			    	
			    	System.out.println("Thnks for using crud application");
			    	
			    	System.exit(0);
			    	
			    	default:
			    		
			    		System.out.println("I think you Entered wrong choice");
			    		
			  
			  
		  }
		}
		  
		    catch(Exception e)
		  {
		    	System.out.println(e);
			  
		  }
		
		finally {
			
			connection.close();
			scanner.close();
			
		}	

	
	}

}
