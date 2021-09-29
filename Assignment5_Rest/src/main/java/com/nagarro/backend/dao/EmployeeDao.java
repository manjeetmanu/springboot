package com.nagarro.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;

import com.nagarro.backend.entity.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Long> {
	
	@Transactional
	@Modifying
	@Query("update Employee set eName= :EmployeeName, location = :Location, email = :Email, dob = :DateOfBirth where eCode= :EmployeeCode")
	void update(@RequestParam("EmployeeCode") int EmployeeCode, @RequestParam("EmployeeName") String EmployeeName,
			@RequestParam("Location") String Location, @RequestParam("Email") String Email,
			@RequestParam("DateOfBirth") String DateOfBirth);
}
