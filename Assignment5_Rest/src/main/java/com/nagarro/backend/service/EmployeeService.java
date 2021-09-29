package com.nagarro.backend.service;

import java.util.List;

import com.nagarro.backend.entity.Employee;

public interface EmployeeService {
	
	public List<Employee> getEmployees();
	public Employee getEmployee(long eCode);
	public Employee addEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	public void deleteEmployee(long ecode);
}
