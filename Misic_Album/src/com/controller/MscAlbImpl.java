package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.AlbumDAO;
import com.dao.MusicImpl;
import com.model.Album;
import com.model.MusicAlbum;

public class MscAlbImpl implements MusicInterface {
	public void execute(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		int m_id=Integer.parseInt(req.getParameter("m_id"));
		int album_id=Integer.parseInt(req.getParameter("album_id"));
		int artist_id=Integer.parseInt(req.getParameter("artist_id"));
		int title_id=Integer.parseInt(req.getParameter("title_id"));
		int genre_id=Integer.parseInt(req.getParameter("genre_id"));
		System.out.println(m_id+" "+album_id+" "+artist_id+" "+title_id+" "+genre_id);
		AlbumDAO obj=new MusicImpl();
		MusicAlbum m=new MusicAlbum(m_id, album_id, artist_id, title_id, genre_id);
		m.setM_id(m_id);
		m.setAlbum_id(album_id);
		m.setArtist_id(artist_id);
		m.setTitle_id(title_id);
		m.setGenre_id(genre_id);
		if(obj.addMusicAlbum(m)) {
			pw.println("Music Album is inserted succesfully");
			pw.println("DO you want continue Music album insertion!!</p>");
			pw.println("<a href='MusicAlbum.jsp'>Click</a>Here</h4>");
		}else {
			pw.println("try Again");
		}
		obj.listMusicAlbums(req, res);
	}

}
