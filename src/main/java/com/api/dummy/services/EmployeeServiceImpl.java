package com.api.dummy.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.dummy.dao.EmployeeRepository;
import com.api.dummy.dao.entity.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository repository;
	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Employee getEmployee(int id) {
		// TODO Auto-generated method stub
		Optional<Employee> emp = repository.findById(id);
		
		Employee _emp=null;
		
		if(emp.isPresent()) {
			_emp= emp.get();
		}
		return _emp ;
	}

}
