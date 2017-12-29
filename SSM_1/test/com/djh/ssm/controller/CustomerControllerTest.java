package com.djh.ssm.controller;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;

import com.djh.ssm.pojo.Customer;
import com.djh.ssm.service.CustomerService;


public class CustomerControllerTest {

	@Resource(name="customerService")
	private CustomerService  customerService;

	@Test
	public void testAdd() {
		Customer customer =  new Customer();
		customer.setCustomerID(12);
		customer.setCustomerIDCard("442372199512050141");
		customer.setCustomerName("ÀîÜ°ºú");
		customer.setCustomerPhone("15976342587");
		customer.setCustomerPwd("123456");
		customerService.addCustomer(customer);
	}
	
	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindById() {
		fail("Not yet implemented");
	}


	@Test
	public void testFindByCondition() {
		fail("Not yet implemented");
	}

}
