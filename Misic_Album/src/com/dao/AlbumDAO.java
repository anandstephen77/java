package com.dao;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Album;
import com.model.Artist;
import com.model.Genre;
import com.model.MusicAlbum;
import com.model.Title;
import com.model.User;

public interface AlbumDAO {
	public boolean addAlbum(Album ab);
	public boolean addArtist(Artist a);
	public boolean addTitle(Title t);
	public boolean addGenre(Genre g);
	public boolean addMusicAlbum(MusicAlbum m);
	public boolean deleteProduct(int pid);
	//ArrayList<Album> listProducts();
	public boolean addUser(User u);
	ArrayList<Album> listAlbums();
	public ArrayList<MusicAlbum> listMusicAlbums(HttpServletRequest req,HttpServletResponse res);

}
