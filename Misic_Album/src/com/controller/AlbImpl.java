package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.AlbumDAO;
import com.dao.ConnectionFactory;
import com.dao.MusicImpl;
import com.model.Album;

public class AlbImpl implements MusicInterface {
	public void execute(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		int album_id=Integer.parseInt(req.getParameter("album_id"));
		String album_name=req.getParameter("album_name");
		int year=Integer.parseInt(req.getParameter("year"));
		System.out.println(album_id+" "+album_name+" "+year);
		AlbumDAO obj=new MusicImpl();
		Album ab=new Album(album_id, album_name, year);
		ab.setAlbum_id(album_id);
		ab.setAlbum_name(album_name);
		ab.setYear(year);
		if(obj.addAlbum(ab)) {
			pw.println("Album is inserted succesfully");
			pw.println("DO you want continue album insertion!!</p>");
			pw.println("<a href='Album.jsp'>Click</a>Here</h4>");
		}else {
			pw.println("try Again");
		}
	}

}
