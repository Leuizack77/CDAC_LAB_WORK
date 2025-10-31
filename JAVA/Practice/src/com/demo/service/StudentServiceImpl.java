package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Student;
import com.demo.dao.StudentDao;
import com.demo.dao.StudentDaoImpl;

public class StudentServiceImpl implements StudentService
{
	StudentDao sdao = new StudentDaoImpl();
	@Override
	public boolean addStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Id");
		int sid = sc.nextInt();
		System.out.println("Enter Name");
		String nm = sc.next();
		System.out.println("Enter Marks m1");
		float m1 = sc.nextFloat();
		System.out.println("Enter Marks m2");
		float m2 = sc.nextFloat();
		System.out.println("Enter DOB");
		String dt=sc.next();
		LocalDate ldt=LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		Student s = new Student(sid, nm, m1, m2, ldt);
		return sdao.save(s);
	}
	@Override
	public Set<Student> displayAll() {
		
		return sdao.displayAll();
	}
	@Override
	public Student findById(int id) {
		return sdao.findById(id);
	}
	@Override
	public List<Student> findByname(String nm) {
		return sdao.searchByName(nm);
	}
	@Override
	public boolean updateM1(int id, int m1) {
		return sdao.updateM1(id, m1);
	}
	@Override
	public boolean updateM2(int id, int m2) {
		return sdao.updateM2(id, m2);
	}
	@Override
	public boolean deleteById(int id) {
		return sdao.deleteId(id);
	}
	@Override
	public boolean deleteByName(String nm) {
		return sdao.deleteName(nm);
	}
	
	

}
