package com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

@Component
public class ConfirmBookingDAOImpl implements ConfirmBookingDAO
{
	@Autowired
	HibernateTemplate template;

	@Override
	public List getdata() {
		
		String query="from Cars";
		List<Cars> data=template.find(query);
		return data;
	}
	
}