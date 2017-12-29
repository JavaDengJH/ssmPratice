package com.djh.ssm.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.djh.ssm.pojo.Customer;

public interface CustomerService {

public void addCustomer(Customer customer);
	
	public void deleteCustomer(int id);
	
//	public void updateCustomer(String name);
	
	public Customer findById(int id);
	
	public List<Customer> findByCondition(String string );
	
	public List<Customer> findAll();
	
}
