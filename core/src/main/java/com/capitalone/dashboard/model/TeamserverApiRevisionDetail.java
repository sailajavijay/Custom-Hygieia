package com.capitalone.dashboard.model;

public class TeamserverApiRevisionDetail {
	private int number;
	private String commitmessage;
	private String author;
	private String mendixversion;
	private String date;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getCommitmessage() {
		return commitmessage;
	}

	public void setCommitmessage(String commitmessage) {
		this.commitmessage = commitmessage;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getMendixversion() {
		return mendixversion;
	}

	public void setMendixversion(String mendixversion) {
		this.mendixversion = mendixversion;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
