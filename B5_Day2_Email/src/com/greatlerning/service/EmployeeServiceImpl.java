package com.greatlerning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

public class EmployeeServiceImpl implements EmployeeService{

	@Override
	public String generateEmailId(String fname, String lname, String deptName) {
		
		return fname+lname+"."+deptName+"@greatlearning.com"; 
	}

	@Override
	public String generatePassword() {
		String caps= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower = "abcdefghijklmnopqrstuvwxyz";
		String nums = "0123456789";
		String splchar = "!@#$%^&*()";
		
		String combined = caps+lower+nums+splchar;
		
		String mypass="";
		
		Random random = new Random();
		
		for(int i=0; i<8 ; i++)
		{
			mypass=mypass+String.valueOf(combined.charAt(random.nextInt(combined.length())));
		}
		
		return mypass;
	}

	@Override
	public void showEmployeeDetails(Employee e) {
		System.out.println("Employee firstname is-->" + e.getFname());
		System.out.println("Employee lastname is-->" + e.getLname());
		System.out.println("Employee email is-->" + e.getEmail());
		System.out.println("Employee password is-->" + e.getPassword());
		
		
	}

}
