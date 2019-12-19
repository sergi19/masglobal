package com.test.masglobal.demo.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toList;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.test.masglobal.demo.dto.EmployeeDTO;
import com.test.masglobal.demo.factory.EmployeeFactory;
import com.test.masglobal.demo.service.EmployeeService;

@Repository
public class EmployeeServiceImpl implements EmployeeService {
	
	@Value("${app.url}")
	private String url;
	
	private List<EmployeeDTO> makeRequestInfoEmployees() {
		return Arrays.asList(new RestTemplate().getForObject(url, EmployeeDTO[].class));
	}
	
	private EmployeeDTO calculateAnualSalary(EmployeeDTO employeeDTO) {
		EmployeeFactory factory = new EmployeeFactory();
		return factory.getEmployees(employeeDTO);
	}
	

	@Override
	public List<EmployeeDTO> getAllEmployees() {
		return makeRequestInfoEmployees().stream()
			.map(obj -> calculateAnualSalary(obj))
			.collect(Collectors.toList());
	}

	@Override
	public List<EmployeeDTO> getEmployeeById(Long id) {
		return makeRequestInfoEmployees().stream()
			.filter(obj -> obj.getId() == id)
			.map(obj -> calculateAnualSalary(obj))
			.collect(Collectors.toList());
	}

}
