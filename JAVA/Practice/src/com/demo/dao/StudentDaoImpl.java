package com.demo.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.demo.beans.Student;

public class StudentDaoImpl implements StudentDao 
{
	static Set<Student> set;
	 static{
		 set=new HashSet<>();
     set.add(new Student(105,"Amit",57,58,LocalDate.of(2023,11,02)));
     set.add(new Student(106,"Ajay",56,38,LocalDate.of(2023,11,02)));
     set.add(new Student(100,"Arti",29,85,LocalDate.of(2024,02,02)));
     set.add(new Student(101,"Anita",46,77,LocalDate.of(2024,02,02)));
     set.add(new Student(103,"Ajay",24,90,LocalDate.of(2023,11,02)));
     set.add(new Student(104,"Ajay",80,95,LocalDate.of(2023,11,02)));
}
	
	//Add Student
	@Override
	public boolean save(Student s) {
		return set.add(s);
	}
	
	//display All
	@Override
	public Set<Student> displayAll() {
		return set;
	}

	//display by id
	@Override
	public Student findById(int id) {
		for(Student s: set) {
			if(s.getId() == id) {
				return s;
			}
		}
		return null;
	}

	@Override
	public List<Student> searchByName(String nm) {
		List<Student> lst = new ArrayList<>();
		for(Student s: set) {
			if(s.getName().equals(nm)) {
				lst.add(s);
			}
		}
		if(lst.size() != 0)
		{
			return lst;
		}
		return null;
	}

	@Override
	public boolean updateM1(int id, int m1) {
		for(Student s: set) {
			if(s.getId() == id) {
				s.setM1(m1);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean updateM2(int id, int m2) {
		for(Student s: set) {
			if(s.getId() == id) {
				s.setM2(m2);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deleteId(int id) {
		for(Student s: set) {
			if(s.getId() == id) {
				set.remove(new Student(id));
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deleteName(String nm) {
		return set.removeIf(s->s.getName().equals(nm));
	}
	
	
	

	
	
	
	
	
	
	

}
