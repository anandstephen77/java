package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.MusicImpl;
import com.model.Album;

public class ListAlbImpl implements MusicInterface {
	public void execute(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();

		MusicImpl pm = new MusicImpl();
		ArrayList<Album> a = pm.listAlbums();
		if (a.isEmpty()) {
			pw.println("No Albums in the cart");
		} else {
			pw.println("<h1 align=center>Albums </h1>");
			pw.println("<table align=center border=1 bgcolor=lavender cellpadding=10px>");
			pw.println("<b><tr><td>Pno</td><td>Pname</td><td>Price</td></tr><b>");
			for (Album p : a) {
				pw.println("<tr><td>" + p.getAlbum_id() + "</td><td> " + p.getAlbum_name() + "</td><td>  " + p.getYear()
						+ "</td></tr>");
			}
		

			pw.println("</table>");

		}
	}
	
	
}
