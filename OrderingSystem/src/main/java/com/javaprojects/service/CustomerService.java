package com.javaprojects.service;

import java.util.List;

import com.javaprojects.entity.Customer;

public interface CustomerService {

	//GET ALL STUDENTS
	public List<Customer> getAllCustomer();

	//ADD THE STUDENT DETAIL
	public Customer addCustomer(Customer customer);

	//GET STUDENT DETAILS OF PARTICULAR ID
	public Customer getCustomerById(int id);

	//FOR DELEING STUDENT DETAILS
	public void deleteCustomer(int id);

	//FOR UPDATING THE STUDENT DETAIL
	public void updateCustomer(Customer customer, int id);

}
