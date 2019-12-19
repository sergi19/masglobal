package com.test.masglobal.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.test.masglobal.demo.dto.EmployeeDTO;
import com.test.masglobal.demo.dto.HourlySalaryEmployeeDTO;
import com.test.masglobal.demo.dto.ResponseDTO;

@Service
public interface EmployeeService {

	List<EmployeeDTO> getAllEmployees();
	
	List<EmployeeDTO> getEmployeeById(Long id);
	
}
