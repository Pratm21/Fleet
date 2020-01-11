package com;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

@Component
public class LocationDAOImpl implements LocationDAO {

	@Autowired
	HibernateTemplate template;
	@Override
	public List getLocations(String city) 
	{
		
		Integer i=0;
		Object[] param1 =new Object[5];
		
		String query1="select c.cityId from CityMaster c where c.cityName=?";
		Object[] param ={city};
		List l=template.find(query1,param);
		Iterator itr= l.iterator();
		while(itr.hasNext())
		{
			i=(Integer) itr.next();
		}
	
		
		String query="select l.locName from Locations l where l.cityMaster.cityId=?";
		
		List list=template.find(query,i); 
		return list;
	}

}
