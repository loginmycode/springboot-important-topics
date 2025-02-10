package com.unit.test.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

import com.unit.test.myapp.Customer;
import com.unit.test.myapp.CustomerService;


@RestController
@RequestMapping("/customer")
public class CustomerController {

	public final CustomerService customerService;

	public CustomerController(CustomerService customerService) {
		
		this.customerService = customerService;
	}
	
	@GetMapping("/getall")
	public List<Customer> getAllCustomer()
	{
		return customerService.getAllCustomer();
	}
	
	
}
