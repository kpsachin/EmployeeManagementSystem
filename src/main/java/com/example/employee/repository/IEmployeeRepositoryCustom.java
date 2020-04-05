package com.example.employee.repository;

import java.util.List;

import com.example.employee.model.Employee;

public interface IEmployeeRepositoryCustom {

	List<Employee> findEmployeeByDept(String deptName);
	List<Employee> findEmployeeByFirstName(String firstName);
	List<Employee> findEmployeeWithAddress(String firstName);
}
