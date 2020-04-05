package com.example.employee.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.model.Employee;
import com.example.employee.repository.IEmployeeRepositoryCustom;
import com.example.employee.service.IAddressService;
import com.example.employee.service.IEmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private IEmployeeService employeeService;
	
	@Autowired
	private IAddressService addressService;
	@Autowired
	private IEmployeeRepositoryCustom employeeRepositoryImpl;
		
	/*
	 * this is for testing services
	 */
	@RequestMapping("/welcome")
	public String welcomeEmployee() {
		return "Welcome Sachin";
	}
	
	/**
	 * 
	 * @param emp it will take employee reference 
	 * @return message of the successfully saved
	 */
	@RequestMapping(method = RequestMethod.POST,value="/addemployee")
	public String addEmployee(@RequestBody Employee emp) {
		emp.setDate();
		
		addressService.addAddress(emp.getAddress());
		employeeService.addEmployee(emp);
		return "Successfully inserted employee with address";
	}
	
	@RequestMapping("/getemp/{id}")
	public Optional<Employee> find(@PathVariable("id") Integer empId) {
		return employeeService.findEmployee(empId);
	}
	
	@RequestMapping("/getallemp")
	public List<Employee> getAllEmployee(){
		return employeeService.findAll();
	}
	
	@RequestMapping("/getcount")
	public Long getCount() {
		return employeeService.count();
	}
	@RequestMapping(method = RequestMethod.DELETE,value = "/deleteemp/{id}")
	public void deleteById(@PathVariable("id") Integer empId) {
		employeeService.deleteEmployee(empId);
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/getallempbyids/{ids}")
	public Iterable<Employee> findAllById(@RequestBody Iterable<Integer> empIds){
		return employeeService.findAllById(empIds);
	}
	
	@RequestMapping("/getempbydeptname/{dept_name}")
	public List<Employee> findEmployeeByDeptname(@PathVariable("dept_name") String deptName){
		return employeeRepositoryImpl.findEmployeeByDept(deptName);
	}
	
	@RequestMapping("/getempbyfirstname/{first_name}")
	public List<Employee> findEmployeeByFirstName(@PathVariable("first_name") String firstName){
		return employeeRepositoryImpl.findEmployeeByFirstName(firstName);
		//return employeeRepositoryImpl.findEmployeeWithAddress(firstName);
	}
}
