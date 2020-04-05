package com.example.employee.service;

import java.util.List;
import java.util.Optional;

import com.example.employee.model.Employee;

public interface IEmployeeService {

	void addEmployee(Employee emp);
	List<Employee> findAll();
	Optional<Employee> findEmployee(Integer empId);
	void deleteEmployee(int empId);
	long count();
	Iterable<Employee> findAllById(Iterable<Integer> ids);
	
}
