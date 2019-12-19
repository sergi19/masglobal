package com.test.masglobal.demo.dto;

import com.test.masglobal.demo.interfaces.IEmployee;

public class MonthlySalaryEmployeeDTO extends EmployeeDTO implements IEmployee {

	@Override
	public float calculateAnualSalary() {
		return getMonthlySalary() * 12;
	}

}
