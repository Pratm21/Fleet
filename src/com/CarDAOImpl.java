package com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

@Component
public class CarDAOImpl implements CarDAO
{

	@Autowired
	HibernateTemplate template;

	@Override
	public List fetchCars() {
		
		String query="from Cars";
		List<Cars> carlist=template.find(query);
		return carlist;
	}
	

}
