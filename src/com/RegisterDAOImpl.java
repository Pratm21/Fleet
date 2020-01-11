package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;
@Component
public class RegisterDAOImpl implements RegisterDAO 
{
	@Autowired
	private HibernateTemplate template;
	@Override
	public void save(Register ref) {
		// TODO Auto-generated method stub
		
		try
		{
		template.save(ref);
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}

}
