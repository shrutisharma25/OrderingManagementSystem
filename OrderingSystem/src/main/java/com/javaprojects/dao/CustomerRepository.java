package com.javaprojects.dao;

import org.springframework.data.repository.CrudRepository;

import com.javaprojects.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer>{

	public Customer findByCid(int cid); 

	
}
