package com.api.dummy.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.dummy.dao.entity.Employee;
import com.api.dummy.services.EmployeeService;

@RestController
@RequestMapping("/api")
public class DemoRestController {
	
	@Autowired
	EmployeeService service;
	
	@GetMapping("/employees/{id}")
	public Employee getEmployee(@PathVariable("id") int id) {
		return service.getEmployee(id);
	}
	
	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		return service.getAllEmployees();
	}

}
