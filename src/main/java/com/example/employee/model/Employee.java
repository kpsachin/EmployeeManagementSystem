/**
 * 
 */
package com.example.employee.model;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.*;

@Entity
public class Employee {

	@Id
	@GeneratedValue
	private int id;
	private String firstName;
	private String lastName;
	private String deptName;
	private String date;
	private String salary;
	
	@OneToOne
	@JoinColumn(name = "address_id")
	private Address address;

	public Employee() {
		
	}
	
	public Employee(int id, String firstName, String lastName, String deptName, String date, String salary,Address Saddress, Address address) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.deptName = deptName;
		this.date = date;
		this.salary = salary;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDate() {
		return date;
	}

	public void setDate() {
		Date newDate = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		String convertedDate = simpleDateFormat.format(newDate);
		this.date = convertedDate;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	
	
	
	
}
