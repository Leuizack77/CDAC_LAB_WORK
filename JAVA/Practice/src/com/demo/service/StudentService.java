package com.demo.service;

import java.util.List;
import java.util.Set;

import com.demo.beans.Student;

public interface StudentService {

	boolean addStudent();

	Set<Student> displayAll();

	Student findById(int id);

	List<Student> findByname(String nm);

	boolean updateM1(int id, int m1);

	boolean updateM2(int id, int m2);

	boolean deleteById(int id);

	boolean deleteByName(String nm);

	

	

}
