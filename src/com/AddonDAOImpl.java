package com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

@Component
public class AddonDAOImpl implements AddOnDAO
{

	

	@Autowired
	HibernateTemplate template;
	
	@Override
	public List fetchAddon() {
		String query="from AddOn";
		List<AddOn> addonlist=template.find(query);
		return addonlist;
	}

	
	
}
