package com.model;

public class MusicAlbum {
	private int m_id;
	private int album_id;
	private int artist_id;
	private int title_id;
	private int genre_id;
	public MusicAlbum() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MusicAlbum(int m_id, int album_id, int artist_id, int title_id, int genre_id) {
		super();
		this.m_id = m_id;
		this.album_id = album_id;
		this.artist_id = artist_id;
		this.title_id = title_id;
		this.genre_id = genre_id;
	}
	public int getM_id() {
		return m_id;
	}
	public void setM_id(int m_id) {
		this.m_id = m_id;
	}
	public int getAlbum_id() {
		return album_id;
	}
	public void setAlbum_id(int album_id) {
		this.album_id = album_id;
	}
	public int getArtist_id() {
		return artist_id;
	}
	public void setArtist_id(int artist_id) {
		this.artist_id = artist_id;
	}
	public int getTitle_id() {
		return title_id;
	}
	public void setTitle_id(int title_id) {
		this.title_id = title_id;
	}
	public int getGenre_id() {
		return genre_id;
	}
	public void setGenre_id(int genre_id) {
		this.genre_id = genre_id;
	}

}
