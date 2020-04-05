package com.example.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employee.dao.IEmployeeDao;
import com.example.employee.model.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	IEmployeeDao empDao;
	
	@Override
	public void addEmployee(Employee emp) {
		empDao.save(emp);
	}

	@Override
	public void deleteEmployee(int empId) {
		empDao.deleteById(empId);
	}

	@Override
	public Optional<Employee> findEmployee(Integer empId) {
		 return empDao.findById(empId);
	}

	@Override
	public List<Employee> findAll() {
		return empDao.findAll();
		
	}

	@Override
	public long count() {
		return empDao.count();
	}

	@Override
	public Iterable<Employee> findAllById(Iterable<Integer> ids) {
		return empDao.findAllById(ids);
	}

	
}
