package com.cwz.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.cwz.dao.CustomerDao;
import com.cwz.po.Customer;
import com.cwz.service.CustomerService;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
	//ע��ע��CustomerDao
	@Autowired
	private CustomerDao customerDao;
	//��ѯ�ͻ�
	public Customer findCustomerById(Integer id) {
		return this.customerDao.findCustomerById(id);
	}
}
