package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.AlbumDAO;
import com.dao.MusicImpl;
import com.model.Album;
import com.model.Title;

public class TitImpl implements MusicInterface{
	public void execute(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		int title_id=Integer.parseInt(req.getParameter("title_id"));
		String title_name=req.getParameter("title_name");
		String writer=req.getParameter("writer");
		String singer=req.getParameter("singer");
		String director=req.getParameter("director");
		String lyrisist=req.getParameter("lyrisist");
		
		System.out.println(title_id+" "+title_name+" "+writer+" "+singer+" "+director+" "+lyrisist);
		AlbumDAO obj=new MusicImpl();
		Title t=new Title(title_id, title_name, writer, singer, director, lyrisist);
		t.setTitle_id(title_id);
		t.setTitle_name(title_name);
		t.setWriter(writer);
		t.setSinger(singer);
		t.setDirector(director);
		t.setLyrisist(lyrisist);
		
		if(obj.addTitle(t)) {
			pw.println("Title is inserted succesfully");
			pw.println("DO you want continue title insertion!!</p>");
			pw.println("<a href='Title.jsp'>Click</a>Here</h4>");
		}else {
			pw.println("try Again");
		}
	}

}
