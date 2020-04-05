package com.example.employee.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Service;

import com.example.employee.model.Employee;

@Service
public class EmployeeRepositoryImpl implements IEmployeeRepositoryCustom {

	@PersistenceContext
	EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> findEmployeeByDept(String deptName) {
		
		Query query = entityManager.createNativeQuery("select * from employeedb.employee "
				+ "where dept_name = ?", Employee.class);
		query.setParameter(1, deptName);
		
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> findEmployeeByFirstName(String firstName) {
		
		Query query = entityManager.createNativeQuery("select * from employeedb.employee " + 
				"where first_name LIKE ?", Employee.class);
		query.setParameter(1, "%"+firstName+"%");
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> findEmployeeWithAddress(String firstName) {
		
		Query query = entityManager.createNamedQuery("select * from employeedb.employee e " +
				"join employeedb.address a on " +
				"e.address_id = a.id " +
				"where e.first_name LIKE ?");
		query.setParameter(1, firstName+"%");
		return query.getResultList();
	}

}
