package com;

import java.util.Iterator;
import java.util.List;

//import org.apache.jasper.tagplugins.jstl.core.ForEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;
@Component
public class CityMasterDAOImpl implements CityMasterDAO 
{
	@Autowired
	HibernateTemplate template;
	@Override
	public List getCity(String state_name) {
		Integer i=0;
		Object[] param1 =new Object[5];
		
		String query1="select s.stateId from StateMaster s where s.stateName=?";
		Object[] param ={state_name};
		List l=template.find(query1,param);
		Iterator itr= l.iterator();
		while(itr.hasNext())
		{
			i=(Integer) itr.next();
		}
		String query="select c.cityName from CityMaster c  where c.stateMaster.stateId =?";
		
		List list=template.find(query,i); 
		return list;
		
	}

	

	

}
