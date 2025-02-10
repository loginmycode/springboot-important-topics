package com.unit.test.myapp;

import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CustomerService {

	private CustomerRepository customerRepository;
	public CustomerService(CustomerRepository customerRepository) {
		
		this.customerRepository=customerRepository;
		
	}
	
	public List<Customer> getAllCustomer()
	{
		return customerRepository.findAll();
	}
	

	
}
