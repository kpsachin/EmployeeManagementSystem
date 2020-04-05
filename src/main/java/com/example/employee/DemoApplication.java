package com.example.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.example.employee.controller.EmployeeController;

@SpringBootApplication
@EntityScan(basePackages = {"com.example.employee"})
public class DemoApplication {
	

	EmployeeController controller = new EmployeeController();
	public static void main(String[] args) {
		
		//DemoApplication application = new DemoApplication();
		SpringApplication.run(DemoApplication.class, args);
		// String str = application.add();
		//System.out.println(str);
	}

	/*
	 * public String add() { Employee employee = new Employee();
	 * employee.setFirstName("Sachin"); employee.setLastName("Patel");
	 * employee.setDeptName("CSE"); employee.setDate(); employee.setSalary("30000");
	 * //String str = employeeController.addEmp(employee);
	 * controller.addEmp(employee); return "Success"; }
	 */

}
