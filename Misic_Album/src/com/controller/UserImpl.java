package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.dao.AlbumDAO;
import com.dao.MusicImpl;
import com.model.Album;
import com.model.User;

public class UserImpl implements MusicInterface {
	public void execute(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		String email_id=req.getParameter("email_id");    
		String password=req.getParameter("password");
		AlbumDAO obj=new MusicImpl();
		User u=new User(email_id, password);
		u.setEmail_id(email_id);
		u.setPassword(password);
		if(obj.addUser(u)) {
			pw.println("user is inserted succesfully");
			pw.println("DO you want continue !!</p>");
			pw.println("<a href='Registration.jsp'>Click</a>Here</h4>");
		}else {
			pw.println("try Again");
		}
	}



}
