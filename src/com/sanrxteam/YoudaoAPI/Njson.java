package com.sanrxteam.YoudaoAPI;

public class Njson {
	private String query;
	private int errorcode;
	private String translation;
	public String getQuery(){
		return query;
	}
	public void setQuery(String query){
		this.query = query;
	}
	public int errorcode(){
		return errorcode;
	}
	public void errorcode(int errorcode){
		this.errorcode = errorcode;
	}
	public String translation(){
		return translation;
	}
	public void translation(String translation){
		this.translation = translation;
	}
	
}
