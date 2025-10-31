package com.demo.beans;

import java.util.Arrays;
import java.util.Date;

public class Friend 
{
	private int fid;
	private String fname;
	private String lname;
	private String[] hobbies;
	private long mobno;
	private String email;
	private Date bdate;
	private String address;
	
	
	public Friend() 
	{
		super();
	}


	public Friend(int fid, String fname, String lname, String[] hobbies, long mobno, String email, Date bdate,
			String address)
	{
		super();
		this.fid = fid;
		this.fname = fname;
		this.lname = lname;
		this.hobbies = hobbies;
		this.mobno = mobno;
		this.email = email;
		this.bdate = bdate;
		this.address = address;
	}


	public int getFid() 
	{
		return fid;
	}
	public void setFid(int fid) 
	{
		this.fid = fid;
	}
	public String getFname()
	{
		return fname;
	}
	public void setFname(String fname) 
	{
		this.fname = fname;
	}
	public String getLname()
	{
		return lname;
	}
	public void setLname(String lname)
	{
		this.lname = lname;
	}
	public String[] getHobbies()
	{
		return hobbies;
	}
	public void setHobbies(String[] hobbies)
	{
		this.hobbies = hobbies;
	}
	public long getMobno() 
	{
		return mobno;
	}
	public void setMobno(long mobno) 
	{
		this.mobno = mobno;
	}
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	public Date getBdate()
	{
		return bdate;
	}
	public void setBdate(Date bdate)
	{
		this.bdate = bdate;
	}
	public String getAddress() 
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}


	@Override
	public String toString() 
	{
		return "Friend [fid=" + fid + ", fname=" + fname + ", lname=" + lname + ", hobbies=" + Arrays.toString(hobbies)
				+ ", mobno=" + mobno + ", email=" + email + ", bdate=" + bdate + ", address=" + address + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
