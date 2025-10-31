package Q2.test;
import Q2.service.StudentService;
import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
       System.out.println("=============STUDENT MANAGEMENT SYSTEM============\n");
       Scanner sc = new Scanner(System.in);
       int choice = 0;
       do 
       {
    	   System.out.println("1) ADD NEW STUDENT\n2) DISPLAY ALL STUDENTS");
    	   System.out.println("3) SEARCH BY ID\n4) GET 'GPA' OF STUDENT \n");
    	   System.out.println("ENTER YOUR CHOICE: ");
   	    choice = sc.nextInt();
    	   
    	   switch(choice) 
    	   {
	    	   case 1:
	    		   StudentService.addStudent();
	    		   break;
	    	   case 2:
	    		   StudentService.displayAll();
	    		   break;
	    	   case 3:
	    		   StudentService.findByID();
	    		   break;
	    	   case 4:
	    		   StudentService.showGPA();
	    		   break;
	    	   case 5:
	    		   sc.close();
	    		   break;
	    	   default:
	    		   System.out.println("WRONG CHOICE");
	    	   }
        }
       while(choice != 5);
	}
}
