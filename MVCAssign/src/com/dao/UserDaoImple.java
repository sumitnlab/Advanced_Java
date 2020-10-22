package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.conn.MyConn;
import com.dto.User;

public class UserDaoImple implements UserDao{
	private MyConn mycon;	
	 public UserDaoImple() {
           mycon = new MyConn();
	}
	@Override
	public int insertUser(User user)
	{
		 int count = 0 ;
		 try
		 {
			 Connection connection = mycon.getconn();
			 String sql = "insert into user_details(fullname,username,password)values(?,?,?)";
			 PreparedStatement pr = connection.prepareStatement(sql); 
			 pr.setString(1, user.getFullname());
			 pr.setString(2, user.getUsername());
			 pr.setString(3, user.getPassword());
			 count = pr.executeUpdate();
			 pr.close();	 
		 }catch(Exception e)
		 {	 
		 }
		return count;
	}

	@Override
	public boolean login(User user) {
		 boolean flag = false;		 
		 try
		 {
			 Connection connection = mycon.getconn();
			 String sql = "select * from user_details where username = ? and password = ?";
			 PreparedStatement pr = connection.prepareStatement(sql);
			 pr.setString(1, user.getUsername());
			 pr.setString(2, user.getPassword());
			 ResultSet rs = pr.executeQuery();
			 if(rs.next())
			 {
				 user.setUser_id(rs.getInt("user_id"));
				 flag = true;		 
			 }
		 }
		 catch(Exception e)
		 {
			 
		 }
		return flag;
	}
}