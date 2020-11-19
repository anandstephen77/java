package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.AlbumDAO;
import com.dao.MusicImpl;
import com.model.Album;
import com.model.Artist;

public class ArtImpl implements MusicInterface {
	public void execute(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		int artist_id=Integer.parseInt(req.getParameter("artist_id"));
		String artist_name=req.getParameter("artist_name");
		String profession=req.getParameter("profession");
		System.out.println(artist_id+" "+artist_name+" "+profession);
		AlbumDAO obj=new MusicImpl();
		Artist a=new Artist(artist_id, artist_name, profession);
		a.setArtist_id(artist_id);
		a.setArtist_name(artist_name);
		a.setProfession(profession);
		if(obj.addArtist(a)) {
			pw.println("Artist is inserted succesfully");
			pw.println("DO you want continue artist insertion!!</p>");
			pw.println("<a href='Artist.jsp'>Click</a>Here</h4>");
		}else {
			pw.println("try Again");
		}
	}

}
