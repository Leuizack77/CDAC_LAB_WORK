package com.demo.test;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;


public class TestEmployeeSetDetails 
{
   public static void main(String[] args) 
   {
	Scanner sc=new Scanner(System.in);
	EmployeeService eservice=new EmployeeServiceImpl();
	int choice=0;
	do 
	{
		System.out.println("1) Add New Employee\n 2) Display All\n 3) Search By Id");
		System.out.println("4) Search By Name\n 5) Update Sal\n 6) Delete By Id\n 7) Delete By Salary\n");
		System.out.println("8) Search By Salary\n 9) Sort By Salary\n 10) Sort By Name\n 11) Sort By Id\n 12) EXIT\n Choice: ");
		choice=sc.nextInt();
		switch(choice) 
		{
		case 1->
		{
			boolean status=eservice.addNewEmployee();
			if(status) 
			{
				System.out.println("ADDED SUCCESSFULLY");
			}
			else
			{
				System.out.println("DUPLICATE ID, NOT ADDED");
			}
		}
		
		
		case 2->
		{
			Set<Employee> eset=eservice.displayAll();
			eset.forEach(System.out::println);
					
		}
		
		
		case 3->
		{
			System.out.println("ENTER THE ID");
			int id=sc.nextInt();
			Employee e=eservice.displayById(id);
			if(e!=null)
			{
				System.out.println(e);
			}
			else 
			{
				System.out.println("NOT FOUND");
			}
		}
		
		
		case 4->
		{
			System.out.println("ENTER THE NAME");
			String nm=sc.next();
			Set<Employee> eset=eservice.displayByName(nm);
			if(eset!=null) 
			{
				eset.forEach(System.out::println);
			}
			else 
			{
				System.out.println("NOT FOUND");
			}
		}
		
		
		case 5->
		{
			System.out.println("ENTER THE ID");
			int id=sc.nextInt();
			
			System.out.println("ENTER THE SALARY");
			double sal =sc.nextDouble();
			
			boolean status = eservice.updateBySal(id,sal);
			if(status) 
			{
				System.out.println("UPDATED SUCCESSFULLY");
			}
			else 
			{
				System.out.println("NOT FOUND");
			}
		}
		
		
		case 6->
		{
			System.out.println("ENTER ID TO DELETE");
			int id = sc.nextInt();
			boolean status =eservice.deleteById(id);
			if(status) 
			{
				System.out.println("DELETED SUCCESSFULLY");
			}
			else 
			{
				System.out.println("NOT FOUND");
			}
		}
		
		
		case 7->
		{
			System.out.println("ENTER THE SALARY");
			double sal =sc.nextDouble();
			boolean status =eservice.deleteBySal(sal);
			if(status) 
			{
				System.out.println("DELETED SUCCESSFULLY");
			}
			else
			{
				System.out.println("NOT FOUND");
			}
		}
		
		
		case 8->
		{
		    System.out.println("EMTER SALARY TO SEARCH:");
		    double sal = sc.nextDouble();
		    Set<Employee> eset = eservice.displayBySal(sal);
		    if (eset != null && !eset.isEmpty()) 
		    {
		        eset.forEach(System.out::println);
		    }
		    else 
		    {
		        System.out.println("NO EMPLOYEES FOUND WITH SALARY: " + sal);
		    }
		}


		case 9->
		{
			List<Employee> elist=eservice.sortBySal();
			elist.forEach(System.out::println);
		}
		
		
		case 10->
		{
			List<Employee> elist=eservice.sortByName();
			elist.forEach(System.out::println);
		}
		
		
		case 11->
		{
			Set<Employee> eset=eservice.sortById();
			eset.forEach(System.out::println);
		}
		
		
		case 12->
		{
			sc.close();
			System.out.println("THANK YOU FOR VISITING.....");
		}
		default->
		{
			System.out.println("WRONG CHOICE");
		}	
	}
}while(choice!=12);
		
}
}
