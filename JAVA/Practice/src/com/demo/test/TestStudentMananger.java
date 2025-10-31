package com.demo.test;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Student;
import com.demo.service.StudentService;
import com.demo.service.StudentServiceImpl;

public class TestStudentMananger {
	public static void main(String args[])
	{
		StudentService sservice = new StudentServiceImpl();
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do 
		{
		  System.out.println("1) Add New Student\n 2) Display All Students\n 3) Search By Id");
		  System.out.println("4) Search By Name\n 5) Update m1\n 6)Update m2\n 7) Delete By Id\n 8) Delete By Name\n");
		  System.out.println(" 9) Sort By m1\n 10) Sort By m2\n 11) Sort By Id\n 12) Sort By name\n 13) Exit \n Choice: ");
		  choice=sc.nextInt();
		  switch(choice) {
		     case 1->
		     {
		    	 boolean status = sservice.addStudent();
		    	 if(status) {
		    		 System.out.println("Added Successfully");
		    	 }else{
		    		 System.out.println("Duplicate id, Not Added");
		    	 }
		     }
		     
		     
		     case 2->
		     {
		    	Set<Student> s = sservice.displayAll();
		    	s.forEach(System.out::println);
		    	
		     }
		     
		     
		     case 3->
		     {
		    	System.out.println("Enter Student id");
		    	int id = sc.nextInt();
		    	Student s = sservice.findById(id);
		    	if(s != null) {
		    		System.out.println(s);
		    	}else {
		    		System.out.println("Not Found");
		    	}
		     }
		     
		     
		     case 4->
		     {
		    	 System.out.println("Enter Student name");
			    	String nm = sc.next();
			    	List<Student> s = sservice.findByname(nm);
			    	if(s != null) {
			    		s.forEach(System.out::println);
			    	}else {
			    		System.out.println("Not Found");
			    	}
		     }
		     
		     
		     case 5->
		     {
		    	 System.out.println("Enter id");
		    	 int id = sc.nextInt();
		    	 System.out.println("Enter m1");
		    	 int m1 = sc.nextInt();
		    	 boolean status = sservice.updateM1(id, m1);
		    	 if(status) {
		    		 System.out.println("Updated Successfully");
		    	 }else {
		    		 System.out.println("Not Found");
		    	 }
		    	 
		     }
		     
		     
		     case 6->
		     {
		    	 System.out.println("Enter id");
		    	 int id = sc.nextInt();
		    	 System.out.println("Enter m2");
		    	 int m2 = sc.nextInt();
		    	 boolean status = sservice.updateM2(id, m2);
		    	 if(status) {
		    		 System.out.println("Updated Successfully");
		    	 }else {
		    		 System.out.println("Not Found");
		    	 }
		     }
		     
		     
		     case 7->
		     {
		    	 System.out.println("Enter id");
		    	 int id = sc.nextInt();
		    	 boolean status = sservice.deleteById(id);
		    	 if(status) {
		    		 System.out.println("Deleted Successfully");
		    	 }else {
		    		 System.out.println("Not Found");
		    	 }
		     }
		     
		     
		     case 8->
		     {
		    	 System.out.println("Enter name");
		    	 String nm = sc.next();
		    	 boolean status = sservice.deleteByName(nm);
		    	 if(status) {
		    		 System.out.println("Deleted Successfully");
		    	 }else {
		    		 System.out.println("Not Found");
		    	 }
		     }
		     
		     
		     case 9->
		     {
		    	 
		     }
		     case 10->
		     {
		    	 
		     }
		     case 11->
		     {
		    	 
		     }
		     case 12->
		     {
		    	 
		     }
		     case 13->
		     {
		    	 sc.close();
		    	 System.out.println("Thanks For Visiting.. ");
		     }
		     default->
		     {
		    	 System.out.println("Wrong Choice");
		     }
		  
		  }
		}while(choice != 13);
	}

}
