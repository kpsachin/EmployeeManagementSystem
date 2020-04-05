/**
 * 
 */
package com.example.employee.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.employee.model.Employee;

@Repository
public interface IEmployeeDao extends JpaRepository<Employee, Integer> {
	
}
