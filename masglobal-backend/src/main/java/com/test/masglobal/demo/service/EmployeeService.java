package com.test.masglobal.demo.service;

import java.util.List;

import com.test.masglobal.demo.dto.EmployeeDTO;

public interface EmployeeService {

	List<EmployeeDTO> getAllEmployees();
	
	List<EmployeeDTO> getEmployeeById(Long id);
	
}
