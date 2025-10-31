package com.demo.beans;

import java.time.LocalDate;
import java.util.Date;

public class Student {
	private int id;
	private String name;
	private float m1;
	private float m2;
	private LocalDate dob;
	
	public Student() {
		super();
	}
	
	public Student(int id) {
		this.id = id;
	}
	
	
	public Student(int id, String name, float m1, float m2, LocalDate dob) {
		super();
		this.id = id;
		this.name = name;
		this.m1 = m1;
		this.m2 = m2;
		this.dob = dob;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getM1() {
		return m1;
	}
	public void setM1(float m1) {
		this.m1 = m1;
	}
	public float getM2() {
		return m2;
	}
	public void setM2(float m2) {
		this.m2 = m2;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", m1=" + m1 + ", m2=" + m2 + ", dob=" + dob + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
