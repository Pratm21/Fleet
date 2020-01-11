package com;

import java.util.List;

import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;
@Component
public class LoginDAOImpl implements LoginDAO 
{
	@Autowired
	private HibernateTemplate template;
	@Override
	public List<Register> checkLogin(Login ref) 
	{
		
        String query = "select k from Register k where k.name=? and k.password=?";
        
        Object[] queryParam = {ref.getUsername(),ref.getPassword()};
       
		List<Register> list=template.find(query,queryParam);
		
		if(list.size()==0)
		{
			return null;
		}
		else
		{
			return list;
		}
	
	}
}






