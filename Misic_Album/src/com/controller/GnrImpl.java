package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.AlbumDAO;
import com.dao.MusicImpl;
import com.model.Artist;
import com.model.Genre;

public class GnrImpl implements MusicInterface{
	public void execute(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		int genre_id=Integer.parseInt(req.getParameter("genre_id"));
		String genre_name=req.getParameter("genre_name");
		String genre_type=req.getParameter("genre_type");
		System.out.println(genre_id+" "+genre_name+" "+genre_type);
		AlbumDAO obj=new MusicImpl();
		Genre g=new Genre(genre_id, genre_name, genre_type);
		g.setGenre_id(genre_id);
		g.setGenre_name(genre_name);
		g.setGenre_type(genre_type);
		if(obj.addGenre(g)) {
			pw.println("genre is inserted succesfully");
			pw.println("DO you want continue genre insertion!!</p>");
			pw.println("<a href='Genre.jsp'>Click</a>Here</h4>");
		}else {
			pw.println("try Again");
		}
	}

}
