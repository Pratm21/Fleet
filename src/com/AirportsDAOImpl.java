package com;
import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;
import java.util.List;
@Component
public class AirportsDAOImpl implements AirportsDAO{
	@Autowired
   private HibernateTemplate template;
	@Override
	public List<Airports> getData() {
		
       List<Airports> l= template.find("SELECT a.airName FROM Airports a");
       return l;
	}

}
