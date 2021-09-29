 package com.nagarro.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.nagarro.backend.entity.Employee;
import com.nagarro.backend.service.EmployeeService;

@RestController
public class MyController {
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping("/home")
	public String home() {
		return "Welcome to courses application";
	}
	
	@GetMapping(value="/employees", produces={"application/json"})
    public List<Employee> getEmployees(){
		return this.employeeService.getEmployees();
	}
	
	@GetMapping("/employees/{eCode}")
	public Employee getEmployee(@PathVariable String eCode) {
		return this.employeeService.getEmployee(Long.parseLong(eCode));
	}
	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee employee) {
		return this.employeeService.addEmployee(employee);
	}
	
	
	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return this.employeeService.updateEmployee(employee);
	}
	
	@DeleteMapping("/employees/{eCode}")
	public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable String eCode){
		try {
			this.employeeService.deleteEmployee(Long.parseLong(eCode));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
