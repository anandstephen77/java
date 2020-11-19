package com.model;

public class Title {
	private int title_id;
	private String title_name;
	private String writer;
	private String singer;
	private String director;
	private String lyrisist;
	public Title() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Title(int title_id, String title_name, String writer, String singer, String director, String lyrisist) {
		super();
		this.title_id = title_id;
		this.title_name = title_name;
		this.writer = writer;
		this.singer = singer;
		this.director = director;
		this.lyrisist = lyrisist;
	}
	public int getTitle_id() {
		return title_id;
	}
	public void setTitle_id(int title_id) {
		this.title_id = title_id;
	}
	public String getTitle_name() {
		return title_name;
	}
	public void setTitle_name(String title_name) {
		this.title_name = title_name;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getLyrisist() {
		return lyrisist;
	}
	public void setLyrisist(String lyrisist) {
		this.lyrisist = lyrisist;
	}

}
