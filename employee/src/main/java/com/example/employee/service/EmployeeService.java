package com.example.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employee.model.Employee;
import com.example.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository repository;

	public List<Employee> getAllEmployees() {
		
		return repository.findAll();
	}

	public Employee addEmployee(Employee employee) {
		
		return repository.save(employee);
		
	}

	public Employee updateEmployee(Employee employee) {
		
		return repository.save(employee);
		
	}
	
	public void deleteEmployee(Long id) {
		
		repository.deleteById(id);
		
	}

}
