package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class TestEmployeeManagementSystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeService eservice=new EmployeeServiceImpl();
		int choice=0;
		do {
			System.out.println(""
					+ "======================================================\n"
					+ "1) Add New Employee\n"
					+ "2) Display All Employee\n"
					+ "3) Search By EmpID\n"
					+ "4) Search By EmpName\n" 
			        + "5) Update EmpSalary\n" 
			        + "6) Delete By EmpID\n" 
			        + "7) Delete By EmpSalary\n"
			        + "8) Search By EmpSalary\n" 
			        + "9) Sort By EmpSalary\n" 
			        + "10) Sort By EmpName\n"
			        + "11) EXIT\n" 
			        +"========================================================\n"
			        + "Enter The Choice: ");
			
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
					System.out.println("NOT FOUND");
				}
			}
			
			case 2->
			{
				List<Employee> elist=eservice.displayAll();
				//display data
				elist.forEach(System.out::println);
			}
			
			case 3->
			{
				System.out.println("ENTER ID FOR SEARCH");
				int eid=sc.nextInt();
				Employee e=eservice.searchById(eid);
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
				System.out.println("ENTER NAME FOR SEARCHING");
				String nm=sc.next();
				List<Employee> elst=eservice.findByName(nm);
				if(elst!=null) 
				{
					elst.forEach(System.out::println);
				}
				else
				{
					System.out.println("NOT FOUND");
				}
			}
			case 5->
			{
				System.out.println("ENTER ID FOR SEARCH");
				int eid=sc.nextInt();
				System.out.println("ENTER SALARY");
				double sal=sc.nextDouble();
				boolean status=eservice.updateById(eid,sal);
				{
					if(status)
					{
						System.out.println("UPDATED SUCCESSFULLY");
					}
					else
					{
						System.out.println("NOT FOUND");
					}
						
				}
				
			}
		
			case 6->
			{
				System.out.println("ENTER ID FOR DELETE");
				int eid=sc.nextInt();
				boolean status=eservice.deleteById(eid);
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
				double sal=sc.nextDouble();
				
				boolean status=eservice.deleteBySalary(sal);
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
				System.out.println("ENTER THE SALARY");
				double sal=sc.nextDouble();
				List<Employee> elist= eservice.searchBySal(sal);
				if(elist!=null) 
				{
					elist.forEach(System.out::println);
					
				}
				else 
				{
					System.out.println("NOT FOUND");
				}
			}
			
			case 9->
			{
				List<Employee> lst=eservice.sortBySal();
				lst.forEach(System.out::println);
			}
			
			case 10->
			{
				List<Employee> lst=eservice.sortByName();
				lst.forEach(System.out::println);
			}
			
			case 11->
			{sc.close();
			     System.out.println("THANK YOU FOR VISITING...."); 
			}
			default->
			{
				System.out.println("WRONG CHOICE");
			}
			}
			
		}while(choice!=11);

	}

}
