package com.cwz.dao;

import com.cwz.po.Customer;

/*Customer�ӿ��ļ�*/
public interface CustomerDao {
	/*����id��ѯ�ͻ���Ϣ*/
	public Customer findCustomerById(Integer id);
}
