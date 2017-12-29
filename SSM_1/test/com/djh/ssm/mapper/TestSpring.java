package com.djh.ssm.mapper;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.djh.ssm.service.CustomerService;

public class TestSpring {

	@Test
	public void test() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/spring/spring.xml");
		CustomerService customerService = (CustomerService) applicationContext.getBean("customerServiceImpl");
		System.out.println(customerService);
	}

}
