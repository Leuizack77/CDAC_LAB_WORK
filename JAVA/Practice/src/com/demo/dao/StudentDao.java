package com.demo.dao;

import java.util.List;
import java.util.Set;

import com.demo.beans.Student;

public interface StudentDao {

	boolean save(Student s);

	Set<Student> displayAll();

	Student findById(int id);

	List<Student> searchByName(String nm);

	boolean updateM1(int id, int m1);

	boolean updateM2(int id, int m2);

	boolean deleteId(int id);

	boolean deleteName(String nm);

	

}
