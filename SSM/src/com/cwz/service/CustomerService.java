package com.cwz.service;

import com.cwz.po.Customer;

public interface CustomerService {
	/*根据id查询客户信息*/
	public Customer findCustomerById(Integer id);
}
