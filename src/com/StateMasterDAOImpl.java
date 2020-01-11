package com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;
@Component
public class StateMasterDAOImpl implements StateMasterDAO{
    @Autowired
    HibernateTemplate template;
	@Override
	public List<StateMaster> getSate() {
		List list=template.find("select s.stateName from StateMaster s");
		//System.out.println("list of movies is \t"+list);
		return list;
	}

}
