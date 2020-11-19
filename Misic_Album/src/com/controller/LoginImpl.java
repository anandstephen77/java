package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.AlbumDAO;
import com.dao.ConnectionFactory;
import com.dao.MusicImpl;
import com.model.User;

public class LoginImpl implements MusicInterface {
	public void execute(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		String email=req.getParameter("email_id");    
		String pass=req.getParameter("password");
		try {
			Connection con=ConnectionFactory.getConnection();
			Statement st=con.createStatement();
			ResultSet res1=st.executeQuery("select * from user");
			while(res1.next()){
				String email_id=res1.getString(1);
				String password=res1.getString(2);
				if(email.equals("sas@ojas-it.com") && pass.equals("12341234")) {
					//RequestDispatcher rd=null;
					//res.sendRedirect("./Admin.html");
					req.getRequestDispatcher("./Admin.html").include(req, res);
					//rd.forward(req, res);
				}else if((email.equals(email_id) && pass.equals(password)) && !(email.equals("sas@ojas-it.com") && pass.equals("12341234"))) {
					//RequestDispatcher rd=null;
					//res.sendRedirect("./Users.jsp");
					req.getRequestDispatcher("./Users.jsp").include(req, res);
					//rd.forward(req, res);
				}else {
					pw.println("Please register");
					//RequestDispatcher rd=null;
					//res.sendRedirect("./Registration.jsp");
					//req.getRequestDispatcher("./Registration.jsp").include(req, res);
					//rd.forward(req, res);
					
				}
		
			}
		}
			catch(Exception e) {
				System.out.println(e);
			}
	
	}

}
