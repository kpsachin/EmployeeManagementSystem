package com.example.employee.model;

import javax.persistence.*;

@Entity
public class Address {

	@Id
	@GeneratedValue
	private int id;
	private String streetName;
	private String cityName;
	private String stateName;
	private String countryName;
	
	public Address() {
		
	}
	
	
	/**
	 * @param id
	 * @param streetName
	 * @param cityName
	 * @param stateName
	 * @param countryName
	 */
	public Address(int id, String streetName, String cityName, String stateName, String countryName) {
		super();
		this.id = id;
		this.streetName = streetName;
		this.cityName = cityName;
		this.stateName = stateName;
		this.countryName = countryName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
	
}
