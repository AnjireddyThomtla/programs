package com.mondee;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Patient_Registration extends HttpServlet
{
	Connection con=null;
	PreparedStatement pst=null;
	public void init(ServletConfig config)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			if(con!=null) {
				System.out.println("connection establieshed");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url="jdbc:mysql://localhost:3306/Anji";
		String username="root";
		String password="Anji@123";
		
		
		try {
			con=DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException
	{
		System.out.println("\n\n \tDATA ADDED SUCCESSFULLY... \n");
		
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		String email=req.getParameter("email");
		//int phone=Integer.parseInt("phone");

		System.out.println("hello");

		PrintWriter pw=resp.getWriter();
		
		String query=" insert into patient_registration(name,password,email) values(?,?,?)";
		
		try {
			
			pst=con.prepareStatement(query);
			pst.setString(1, username);
			pst.setString(2, password);
			pst.setString(3, email);
			//pst.setLong(4, phone);
			int count=pst.executeUpdate();
			
			if(count!=0) {
				resp.sendRedirect("./patient_registration.html");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}