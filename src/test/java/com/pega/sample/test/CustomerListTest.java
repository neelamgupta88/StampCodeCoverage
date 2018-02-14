package com.pega.sample.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.pega.sample.operations.CustomerList;
import com.pega.sample.users.Customer;

public class CustomerListTest {
	
	private CustomerList customers;
	
	@Before
	public void setUp() {
		customers = new CustomerList();
	}
	
	@Test
	public void addCustomerTest() {
		Customer customer = new Customer("Neelam", "India");
		
		Assert.assertTrue(customers.addCustomer(customer));
	}
	
	@Test
	public void getCustomerTest() throws Exception {
		addCustomerTest();
		Assert.assertNotNull(customers.getCustomerByName("Neelam"));
	}
	
	@Test
	public void deleteCustomerTest() throws Exception {
		addCustomerTest();
		Assert.assertTrue(customers.deleteCustomer(customers.getCustomerByName("Neelam").getId()));
	}

}
