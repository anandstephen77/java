package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	HashMap<String,MusicInterface> map;
   
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		map=new HashMap<String,MusicInterface>();
		map.put("Add1",new AlbImpl());
		map.put("List",new ListAlbImpl());
		map.put("Add2",new ArtImpl());
	    map.put("Add3",new TitImpl());
	    map.put("Add4",new GnrImpl());
	    map.put("Add5",new MscAlbImpl());
	    map.put("Add6",new UserImpl());
	    map.put("Add7", new LoginImpl());
	}

	public void destroy() {
		// TODO Auto-generated method stub
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String aName=request.getParameter("action");
		MusicInterface obj=map.get(aName);
        
		obj.execute(request,response);
	}


}
