package com.javaprojects.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaprojects.dao.CustomerRepository;
import com.javaprojects.entity.Customer;
import com.javaprojects.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerRepository customerRepository;

	@Override
	public List<Customer> getAllCustomer() {
		List<Customer> list = (List<Customer>)this.customerRepository.findAll();
		return list;
	}

	@Override
	public Customer addCustomer(Customer c) {
		Customer customer = customerRepository.save(c);
		return customer;
	}

	@Override
	public Customer getCustomerById(int id) {
		Customer customer =null;
		try {
			this.customerRepository.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return customer;
	}

	@Override
	public void deleteCustomer(int id) {
		customerRepository.deleteById(id);		
	}

	//FOR UPDATING THE STUDENT DETAIL
	@Override
	public void updateCustomer(Customer customer, int id) {
		customer.setId(id);
		customerRepository.save(customer);
	}
}
