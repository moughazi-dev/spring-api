package com.api.dummy.services;

import java.util.List;

import com.api.dummy.dao.entity.Employee;


public interface EmployeeService {

	List<Employee> getAllEmployees();
	Employee getEmployee(int id);
}
