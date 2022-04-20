package com.naveen.services;

import java.util.List;

import com.naveen.entities.Employee;

public interface EmployeeService {

	public List<Employee> getEmployees();
	
	public Employee getEmployee(long employeeId);
}
