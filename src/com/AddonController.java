package com;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddonController {
	
	@Autowired
	AddOnDAO dao;
	
	@RequestMapping(value="/Addon",method=RequestMethod.POST)
	
	
	public String getRecords(HttpSession session)
	{
		List<AddOn> mylist=dao.fetchAddon();
		session.setAttribute("addOnlist",mylist);
		return "Addon.definition";
	}
	




}
