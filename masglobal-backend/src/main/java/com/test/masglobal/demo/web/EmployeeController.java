package com.test.masglobal.demo.web;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.masglobal.demo.dto.EmployeeDTO;
import com.test.masglobal.demo.dto.ResponseDTO;
import com.test.masglobal.demo.service.EmployeeService;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	private EmployeeService employeeService;
	
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
        @CrossOrigin(value = "http://localhost:4200")
	@GetMapping("/getAllEmployees")
	public List<EmployeeDTO> getInfoEmployees() {
		return employeeService.getAllEmployees();
	}
	
        @CrossOrigin(value = "http://localhost:4200")
	@GetMapping("/getEmployeeById/{id}")
	public List<EmployeeDTO> getInfoEmployees(@PathVariable Long id) {
		return employeeService.getEmployeeById(id);
	}

}
