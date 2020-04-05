package com.example.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employee.dao.IAddressDao;
import com.example.employee.model.Address;

@Service
public class AddressServiceImpl implements IAddressService {

	@Autowired
	IAddressDao addressDao; 
	
	@Override
	public void addAddress(Address address) {
		addressDao.save(address);
	}

}
