package com.greatlerning.service;

import com.greatlearning.model.Employee;

public interface EmployeeService {
	
	String generateEmailId(String fname, String lname, String deptName);
	String generatePassword();
	void showEmployeeDetails(Employee e);
	
	
}
