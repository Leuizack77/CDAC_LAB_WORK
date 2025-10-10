package com.demo.collections.service;
import com.demo.collections.beans.Employee;

import java.util.List;

public interface EmployeeService {

	boolean addNewEmployee();

	List<Employee> displayAll();

	Employee searchById(int eid);

	boolean deleteById(int eid);

	List<Employee> findByName(String nm);

}
