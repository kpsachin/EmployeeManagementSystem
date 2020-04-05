package com.example.employee.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employee.model.Address;

public interface IAddressDao extends JpaRepository<Address, Integer> {

}
