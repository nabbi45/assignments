package com.naveen.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.naveen.entities.Employee;


@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	List<Employee> list;
	
	public EmployeeServiceImpl() {
		list = new ArrayList<>();
		list.add(new Employee(112, "Naveen", "SDE", "SDE1", 20000));
		list.add(new Employee(113, "Rakesh", "SDE", "SDE2", 30000));
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Employee getEmployee(long employeeId) {
	
		//Employee e = null;
		
		return list.stream().filter(e -> e.getEmployeeId()==employeeId).findFirst().get();
	}

}
