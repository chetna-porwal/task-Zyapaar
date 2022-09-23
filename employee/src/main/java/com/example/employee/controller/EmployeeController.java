package com.example.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.model.Employee;
import com.example.employee.service.EmployeeService;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	@GetMapping("/getallemployees")
	public List<Employee> getAllEmployees()
	{
		return service.getAllEmployees();
	}
	
	@PostMapping("/addemployee")
	public String createEmployee(@RequestBody Employee employee)
	{
		Employee e = service.addEmployee(employee);
		if(e != null)
			return "Employee Created Successfully !";
		else
			return "Employee Not Created !";
	}
	
	@PutMapping("/updateemployee")
	public Employee updateEmployee(@RequestBody Employee employee)
	{
		return service.updateEmployee(employee);
	}
	
	@DeleteMapping("/deleteemployee")
	public String deleteEmployee(Long id)
	{
		service.deleteEmployee(id);
		return "Employee deleted successfully";
	}

}
