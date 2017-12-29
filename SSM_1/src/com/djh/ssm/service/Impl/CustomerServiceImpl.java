package com.djh.ssm.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.djh.ssm.controller.CustomerController;
import com.djh.ssm.mapper.CustomerMapper;
import com.djh.ssm.pojo.Customer;
import com.djh.ssm.service.CustomerService;


@Transactional
@Service(value="customerService")
public class CustomerServiceImpl implements CustomerService {

	   Logger logger = Logger.getLogger(CustomerServiceImpl.class);
	
	@Resource
	public CustomerMapper customerMapper;

	@Override
	public void addCustomer(Customer customer) {
		customerMapper.addCustomer(customer);
	}

	@Override
	public void deleteCustomer(int id) {
		customerMapper.deleteCustomer(id);
	}

	@Override
	public Customer findById(int id) {
		Customer customer = customerMapper.findById(id);
		//FIXME
		return customer ;
	}

	@Override
	public List<Customer> findByCondition(String string) {
		List<Customer> customers = customerMapper.findByCondition(string);
		//FIXME
		return customers;
	}

	@Override
	public List<Customer> findAll() {
		List<Customer> customers = customerMapper.findAll();
		for (Customer c : customers) {
			logger.info(c.getCustomerName());
			logger.info(c.getCustomerIDCard());
			logger.info(c.getCustomerPhone());
		}
		return customers;
	}
	
}
