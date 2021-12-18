package com.lti.eurekaProducer.controller;
import static org.mockito.Mockito.when;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import com.lti.eurekaProducer.model.*;

import com.lti.eurekaProducer.dao.CustomerRepository;
// @RunWith attaches a runner with the test class to initialize the test data
@RunWith(MockitoJUnitRunner.class)
public class TestContollerTest {

	@Autowired
	CustomerRepository repository;
	
	@InjectMocks
	TestController testController  = new TestController();
	
	public Customer getCustomer() {
		
		Customer c = new Customer();
		c.setId(1);
		c.setAccType("savings");
		c.setAge(22);
		c.setName("Aakash");
		c.setAddress("pune");
		return c;
		
	}

	
	@Test
	void addcustomer() {
		Customer customer =getCustomer();
	when(repository.save(Mockito.any())).thenReturn(customer);	
	testController.addCustomer(customer);
	}
	
}
