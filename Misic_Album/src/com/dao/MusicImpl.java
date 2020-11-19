package com.dao;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Album;
import com.model.Artist;
import com.model.Genre;
import com.model.MusicAlbum;
import com.model.Title;
import com.model.User;
public class MusicImpl implements AlbumDAO{
	public boolean addAlbum(Album ab) {
		boolean b=false;
		Connection con=ConnectionFactory.getConnection();
		System.out.println(con+"Connected");
		try {
			PreparedStatement pst=con.prepareStatement("insert into album values(?,?,?)");
			pst.setInt(1, ab.getAlbum_id());
			pst.setString(2, ab.getAlbum_name());
			pst.setInt(3, ab.getYear());
			int res=pst.executeUpdate();
			if(res>0) {
				b=true;
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return b;
	}
	@Override
	public ArrayList<Album> listAlbums(){
		Connection con = ConnectionFactory.getConnection();
		System.out.println(con + " Connected");

		ArrayList<Album> al = new ArrayList<Album>();
		try {
			PreparedStatement pst = con.prepareStatement("select * from album");
			ResultSet res = pst.executeQuery();
			while (res.next()) {
				Album ab = new Album(res.getInt(1), res.getString(2), res.getInt(3));
				al.add(ab);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return al;
		
	}
//	@Override
//	public boolean deleteProduct(int pid) {
//		Connection con = ConnectionFactory.getConnection();
//		System.out.println(con + " Connected");
//		boolean b = false;
//		try {
//			PreparedStatement pst = con.prepareStatement("delete from product where pid=?");
//			pst.setInt(1, pid);
//			int res = pst.executeUpdate();
//			if (res > 0) {
//				b = true;
//			}
//
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//		return b;
//	}
	public boolean addTitle(Title t) {
		// TODO Auto-generated method stub
		boolean b=false;
		Connection con=ConnectionFactory.getConnection();
		System.out.println(con+"Connected");
		try {
			PreparedStatement pst=con.prepareStatement("insert into title values(?,?,?,?,?,?)");
			pst.setInt(1, t.getTitle_id());
			pst.setString(2, t.getTitle_name());
			pst.setString(3, t.getWriter());
			pst.setString(4, t.getSinger());
			pst.setString(5, t.getDirector());
			pst.setString(6, t.getLyrisist());
			int res=pst.executeUpdate();
			if(res>0) {
				b=true;
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return b;
	}
	public boolean addArtist(Artist a) {
		// TODO Auto-generated method stub
		boolean b=false;
		Connection con=ConnectionFactory.getConnection();
		System.out.println(con+"Connected");
		try {
			PreparedStatement pst=con.prepareStatement("insert into artist values(?,?,?)");
			pst.setInt(1, a.getArtist_id());
			pst.setString(2, a.getArtist_name());
			pst.setString(3, a.getProfession());
			int res=pst.executeUpdate();
			if(res>0) {
				b=true;
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return b;
	}
	
	public boolean addGenre(Genre g) {
		// TODO Auto-generated method stub
		boolean b=false;
		Connection con=ConnectionFactory.getConnection();
		System.out.println(con+"Connected");
		try {
			PreparedStatement pst=con.prepareStatement("insert into genre values(?,?,?)");
			pst.setInt(1, g.getGenre_id());
			pst.setString(2, g.getGenre_name());
			pst.setString(3, g.getGenre_type());
			int res=pst.executeUpdate();
			if(res>0) {
				b=true;
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return b;
		
	}
	public boolean addMusicAlbum(MusicAlbum m) {
		boolean b=false;
		Connection con=ConnectionFactory.getConnection();
		System.out.println(con+"Connected");
		try {
			PreparedStatement pst=con.prepareStatement("insert into music_album values(?,?,?,?,?)");
			pst.setInt(1, m.getM_id());
			pst.setInt(2, m.getAlbum_id());
			pst.setInt(3, m.getArtist_id());
			pst.setInt(4, m.getTitle_id());
			pst.setInt(5, m.getGenre_id());
			int res=pst.executeUpdate();
			if(res>0) {
				b=true;
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return b;
	}
	@Override
	public boolean addUser(User u) {
		// TODO Auto-generated method stub
		boolean b=false;
		Connection con=ConnectionFactory.getConnection();
		System.out.println(con+"Connected");
		try {
			PreparedStatement pst=con.prepareStatement("insert into user values(?,?)");
			pst.setString(1, u.getEmail_id());
			pst.setString(2, u.getPassword());
			
			int res=pst.executeUpdate();
			if(res>0) {
				b=true;
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return b;
	}
	
	@Override
	public boolean deleteProduct(int pid) {
		// TODO Auto-generated method stub
		return false;
	}
	public ArrayList<MusicAlbum> listMusicAlbum() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ArrayList<MusicAlbum> listMusicAlbums(HttpServletRequest req, HttpServletResponse res) {
		
		// TODO Auto-generated method stub
		Connection con=ConnectionFactory.getConnection();
        System.out.println(con+"connected");
        ArrayList<MusicAlbum> list=new ArrayList<MusicAlbum>();
        res.setContentType("text/html");
        try {
            PrintWriter pw=res.getWriter();
            PreparedStatement pst=con.prepareStatement("select m.m_id, a.album_name,a.year,"
                    +"ar.artist_name,ar.profession,t.title_name,t.writer,"
                    +"t.singer,t.director,g.genre_name,g.genre_type from album as a\r\n"
                    + "inner join music_album as m on m.album_id=a.album_id \r\n"
                    +"inner join artist as ar on m.artist_id=ar.artist_id\r\n"
                    +"inner join title as t on m.title_id=t.title_id\r\n"   
                    + "inner join genre as g on m.genre_id=g.genre_id;");
            ResultSet rs=pst.executeQuery();
            pw.println("<html><body bgcolor=salmon>");
            pw.println("<table border=1>");
            pw.println("<tr><td><b>music_id</b></td><td><b>album_name</b></td>"
                    + "<td><b>year</b></td><td><b>artist_name</b></td><td><b>profession</b></td>"
                    + "<td><b>title_name</b></td><td><b>writer</b></td><td><b>singer</b></td>"
                    + "<td><b>director</b></td><td><b>genre_name</b></td><td><b>genre_type</b></td></tr>");
            while(rs.next()) {
            	int m_id=rs.getInt("m_id");
                String alb_name=rs.getString("album_name");
                int year=rs.getInt("year");
                String ar_name=rs.getString("artist_name");
                String profession=rs.getString("profession");
                String title_name=rs.getString("title_name");
                String writer=rs.getString("writer");
                String singer=rs.getString("singer");
                String director=rs.getString("director");
                String genre1=rs.getString("genre_name");
                String genre2=rs.getString("genre_type");
              
                pw.println("<tr><td>"+m_id+"</td>"+alb_name+"</td><td>"+year+"</td><td>"+ar_name+"</td>"
                        + "<td>"+profession+"</td><td>"+title_name+"</td>"
                                + "<td>"+writer+"</td><td>"+singer+"</td><td>"+director+"</td>"
                                        + "<td>"+genre1+"</td><td>"+genre2+"</td></tr>");
            }
            pw.println("</table>");
            pw.println("</body></html>");
           
        }
        catch(Exception e) {
            System.out.println(e);
        }
       
      
       return list;
	}
	

}
