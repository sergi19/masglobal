package com.test.masglobal.demo.dto;

import com.test.masglobal.demo.interfaces.IEmployee;

public class HourlySalaryEmployeeDTO extends EmployeeDTO implements IEmployee {

	@Override
	public float calculateAnualSalary() {
		return 120 * getHourlySalary() * 12;
	}
	
}
