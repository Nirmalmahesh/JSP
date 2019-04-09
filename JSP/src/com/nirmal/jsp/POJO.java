package com.nirmal.jsp;

import java.io.Serializable;

public class POJO implements Serializable {

	int s_id;
	String fname;
	String lname;
	String city;
	String State;
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public POJO(int s_id, String fname, String lname, String city, String state) {
		super();
		this.s_id = s_id;
		this.fname = fname;
		this.lname = lname;
		this.city = city;
		State = state;
	}
	public POJO() {
		super();
	}
	
	
	
}
