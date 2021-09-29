package com.nagarro.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.backend.dao.EmployeeDao;
import com.nagarro.backend.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao employeeDao;
	
	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return employeeDao.findAll();
	}

	@Override
	public Employee getEmployee(long eCode) {
		// TODO Auto-generated method stub
		return employeeDao.getById(eCode);
	}

	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeDao.save(employee);
		return employee;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeDao.update(employee.geteCode(), employee.geteName(), employee.getLocation(), employee.getEmail(),
				employee.getDob());
		return employee;
	}

	@Override
	public void deleteEmployee(long eCode) {
		// TODO Auto-generated method stub
		Employee employee=employeeDao.getById(eCode);
		employeeDao.delete(employee);
	}
	
}
