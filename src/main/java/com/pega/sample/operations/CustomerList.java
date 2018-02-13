package com.pega.sample.operations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.pega.sample.exception.SampleException;
import com.pega.sample.users.Customer;

public class CustomerList {
	
	private List<Customer> customers;
	
	
	public CustomerList() {
		customers = new ArrayList<>();
	}
	
	public boolean addCustomer(Customer customer) {
		customer.setId(UUID.randomUUID().toString());
		return customers.add(customer);
	}
	
	public boolean deleteCustomer(String id) {
		Optional<Customer> customerInfo = customers.stream().filter(customer -> customer.getId().equals(id)).findFirst();
		if(customerInfo.isPresent()) {
			customers.remove(customerInfo.get());
			return true;
		} else {
			return false;
		}
	}

	public Customer getCustomer(String id) throws SampleException{
		Optional<Customer> customerInfo = customers.stream().filter(customer -> customer.getId().equals(id)).findFirst();
		if(customerInfo.isPresent()) {
			return customerInfo.get();
		} else {
			throw new SampleException("Customer does not exist");
		}
	}
	
	public Customer getCustomerByName(String name) throws SampleException {
		Optional<Customer> customerInfo = customers.stream().filter(customer -> customer.getName().equals(name)).findFirst();
		if(customerInfo.isPresent()) {
			return customerInfo.get();
		} else {
			throw new SampleException("Customer does not exist");
		}
	}
	
	public void updateCustomer(String id, Customer updatedCustomer) {
		try {
				Customer customer = getCustomer(id);
		}catch(SampleException e) {
			System.out.println("Customer does not exist. Creating a new record.");
			addCustomer(updatedCustomer);
		}
		
	}
	
}
