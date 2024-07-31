package com.greatlearning.app;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlerning.service.EmployeeServiceImpl;

public class DriverApp {

	public static void main(String[] args) {
		EmployeeServiceImpl empImpl= new EmployeeServiceImpl();
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your firstname-->");
		String fname=sc.next().toLowerCase();
		
		System.out.println("Please enter your lastname-->");
		String lname=sc.next().toLowerCase();


		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		System.out.println("Please choose department");
		int choice=sc.nextInt();
		
		String genEmail="";
		String genPassword="";
		
		switch(choice)
		{
		case 1:  genEmail=empImpl.generateEmailId(fname, lname, "tech");break;
		case 2:  genEmail=empImpl.generateEmailId(fname, lname, "admin");break;
		case 3:  genEmail=empImpl.generateEmailId(fname, lname, "hr");break;
		case 4:  genEmail=empImpl.generateEmailId(fname, lname, "legal");break;
		default: System.out.println("Please enter valid input");
			
		}
		
		System.out.println(genEmail);
		genPassword=empImpl.generatePassword();
		System.out.println(genPassword);

		Employee e1 = new Employee();
		e1.setFname(fname);
		e1.setLname(lname);
		e1.setEmail(genEmail);
		e1.setPassword(genPassword);
		empImpl.showEmployeeDetails(e1);
	
	}


}
