package com.cwz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.cwz.po.Customer;
import com.cwz.service.CustomerService;

@Controller
public class CustomerController {
	@Autowired
	CustomerService customerService;
	
	@RequestMapping("/toCustomer")
	public String toCustomer() {
		return "customer";
	}
	
	@RequestMapping("/findCustomerById")
	public String findCustomerById(Integer id, Model model) {	
		Customer customer = customerService.findCustomerById(id);
		model.addAttribute("customer", customer);
		return "customer";
	}
}
