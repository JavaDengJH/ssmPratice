package com.djh.ssm.mapper;

import java.util.List;

import com.djh.ssm.pojo.Customer;

public interface CustomerMapper {

	public void addCustomer(Customer customer);
	
	public void deleteCustomer(int id);
	
//	public void updateCustomer(String name);
	
	public Customer findById(int id);
	
	public List<Customer> findByCondition(String string );
	
	public List<Customer> findAll();
}
