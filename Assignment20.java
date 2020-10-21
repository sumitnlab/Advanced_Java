package com.date;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DateServlet")
public class DateServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	
	{
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		
		 java.util.Date date = new Date();
		 
		 out.print("<h1>" + date.toString() + "</h1>");
		 
		 out.flush();
		 
		 out.close();
	}

}
