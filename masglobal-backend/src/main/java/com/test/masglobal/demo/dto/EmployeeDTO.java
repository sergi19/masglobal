package com.test.masglobal.demo.dto;

public class EmployeeDTO {

private Long id;
	
	private String name;
	
	private String contractTypeName;
	
	private Long roleId;
	
	private String roleName;
	
	private String roleDescription;
	
	private Float hourlySalary;
	
	private Float monthlySalary;
	
	private Float anualSalary;

	public EmployeeDTO() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContractTypeName() {
		return contractTypeName;
	}

	public void setContractTypeName(String contractTypeName) {
		this.contractTypeName = contractTypeName;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleDescription() {
		return roleDescription;
	}

	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}

	public Float getHourlySalary() {
		return hourlySalary;
	}

	public void setHourlySalary(Float hourlySalary) {
		this.hourlySalary = hourlySalary;
	}

	public Float getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(Float monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	public Float getAnualSalary() {
		return anualSalary;
	}

	public void setAnualSalary(Float anualSalary) {
		this.anualSalary = anualSalary;
	}	
	
}
