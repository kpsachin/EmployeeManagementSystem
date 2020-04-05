package com.example.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.model.Address;
import com.example.employee.service.IAddressService;

@RestController
@RequestMapping("/address")
public class AddressController {

	@Autowired
	private IAddressService addressService;
	
	/**
	 * 
	 * @param address it will take reference from the request
	 * @return message of successfully add the address
	 */
	@RequestMapping(method = RequestMethod.POST,value = "/addaddress")
	public String addAddress(@RequestBody Address address) {
		 addressService.addAddress(address);
		 return "Successfully added address";
	}
}
