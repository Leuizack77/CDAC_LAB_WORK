package com.set.test;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.set.beans.Employee;
import com.set.service.EmployeeService;
import com.set.service.EmployeeServiceImpl;


public class TestEmployeeSetDetails 
{
   public static void main(String[] args) 
   {
	Scanner sc=new Scanner(System.in);
	EmployeeService eservice=new EmployeeServiceImpl();
	int choice=0;
	do 
	{
		System.out.println("1. Add New Employee\n2. Display All\n3. Search By Id");
		System.out.println("4. Search By Name\n5. Update Salary\n6. Delete By Id\n7. Delete By Salary\n");
		System.out.println("8. Search By Salary\n9. Sort By Salary\n10. Sort By Name\n11. Sort By Id\n12. EXIT\n Choice: ");
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
                    System.out.println("ENTER ID");
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
                    System.out.println("ENTER NAME");
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
                    System.out.println("ENTER ID");
                    int id=sc.nextInt();
                    
                    System.out.println("ENTER SALARY");
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
                    System.out.println("ENTER SALARY");
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
                    
                }
                
                case 9->
                {
                    List<Employee> elist=eservice.sortBySal();
                    elist.forEach(System.out::println);	
                }
                
                case 10->
                {
                    List<Employee> elist=eservice.sortByName();
                    //elist.forEach(e->System.out.println(e));
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
        }
        while(choice!=12);
	}
}
