package com.test.masglobal.demo.factory;

import org.springframework.beans.factory.annotation.Value;

import com.test.masglobal.demo.dto.EmployeeDTO;
import com.test.masglobal.demo.dto.HourlySalaryEmployeeDTO;
import com.test.masglobal.demo.dto.MonthlySalaryEmployeeDTO;
import com.test.masglobal.demo.util.Constants;
import org.springframework.stereotype.Component;

@Component
public class EmployeeFactory {
	
	public EmployeeDTO getEmployees(EmployeeDTO employeeDTO) {
		switch (employeeDTO.getContractTypeName()) {
			case Constants.HOURLY_CONTRACT_TYPE:
				HourlySalaryEmployeeDTO instanceHourly = new HourlySalaryEmployeeDTO();
				instanceHourly.setId(employeeDTO.getId());
				instanceHourly.setName(employeeDTO.getName());
				instanceHourly.setContractTypeName(employeeDTO.getContractTypeName());
				instanceHourly.setRoleDescription(employeeDTO.getRoleDescription());
				instanceHourly.setRoleId(employeeDTO.getRoleId());
				instanceHourly.setRoleName(employeeDTO.getRoleName());
				instanceHourly.setHourlySalary(employeeDTO.getHourlySalary());
				instanceHourly.setMonthlySalary(employeeDTO.getHourlySalary());
				instanceHourly.setAnualSalary(instanceHourly.calculateAnualSalary());
				return instanceHourly;
				
			case Constants.MONTHLY_CONTRACT_TYPE:
				MonthlySalaryEmployeeDTO instanceMonthly = new MonthlySalaryEmployeeDTO();
				instanceMonthly.setId(employeeDTO.getId());
				instanceMonthly.setName(employeeDTO.getName());
				instanceMonthly.setContractTypeName(employeeDTO.getContractTypeName());
				instanceMonthly.setRoleDescription(employeeDTO.getRoleDescription());
				instanceMonthly.setRoleId(employeeDTO.getRoleId());
				instanceMonthly.setRoleName(employeeDTO.getRoleName());
				instanceMonthly.setHourlySalary(employeeDTO.getHourlySalary());
				instanceMonthly.setMonthlySalary(employeeDTO.getHourlySalary());
				instanceMonthly.setAnualSalary(instanceMonthly.calculateAnualSalary());
				return instanceMonthly;
	
			default:
				return null;
		}
	}
	
}
