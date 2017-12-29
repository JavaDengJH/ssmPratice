package com.djh.ssm.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.LogFactory;
import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.djh.ssm.pojo.Customer;
import com.djh.ssm.service.CustomerService;

@Controller 
@RequestMapping("/customer")
public class CustomerController {

   @Resource
    CustomerService customerService;
    
   Logger logger = Logger.getLogger(CustomerController.class);
   
   
   
   @RequestMapping("/findById")
  	public Customer findById(int id) {
  		Customer customer = customerService.findById(id);
  		//FIXME
  		return customer ;
  	}
   
   
   
   @RequestMapping("/findByIdConditionr")
 	public List<Customer> findByCondition(String string) {
 		List<Customer> customers = customerService.findByCondition(string);
 		//FIXME
 		
 		return customers;
 	}
   
   @RequestMapping("/addCustomer")
	public void addCustomer() {
	//TODO
	}
   
   @RequestMapping("/deleteCustomer")
 	public void deleteCustomer(int id) {
 		customerService.deleteCustomer(id);
 	}
   
   @RequestMapping("/findAll")
	public String findAll(HttpServletRequest request,HttpServletResponse response) {
		List<Customer> customers = customerService.findAll();
		logger.info(customers.size());
		for (Customer c : customers) {
			logger.info(c.getCustomerName());
			logger.info(c.getCustomerIDCard());
			logger.info(c.getCustomerPhone());
		}
		request.setAttribute("customers", customers);
		return "data";
	}
   
   		@RequestMapping("/main")
   		public String main() {
   			return "ssmJsp";
   		}
   
}