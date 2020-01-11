package com;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
@Controller
public class RegisterController
{
	DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	@Autowired
	CarDAO dao;
	@Autowired
	RegisterValidator registervalidator;
	@Autowired
	RegisterDAO registerdao;
	@Autowired
	AirportsDAO air;
	@Autowired
	CityMasterDAO citydao;
	@Autowired
	StateMasterDAO statedao;
	@Autowired
	LocationDAO locdao;
	List <String>publisherlist;
	HomePage hm= new HomePage();
	@RequestMapping( method = RequestMethod.POST)
	public String processSubmit(@Valid	@ModelAttribute("myregister")Register register,BindingResult result)
		{
		registervalidator.validate(register, result);
		System.out.println("processSubmit is called");
		System.out.println("in ProcessSubmit\t"+register);
		if(result.hasErrors())
		{
			return "Register.definition";
		}
		else
		{
			registerdao.save(register);
			return "success.definition";
		}
	}
	
	@InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
		//System.out.println("initBinder is called");
             SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");    
             webDataBinder.registerCustomEditor(Date.class,"dob", new CustomDateEditor(dateFormat, false));
         }
	
	@RequestMapping(value = "/Register",method = RequestMethod.GET)
	public ModelAndView before()
	{
		Register register=new Register();
		return new ModelAndView("Register.definition","myregister",register);
	}
	
	
	@RequestMapping(value="/first",method = RequestMethod.GET)
	public ModelAndView index(HttpSession session,HttpServletRequest request)
	{
		
		List<Airports> ls=air.getData();
		 List l=  statedao.getSate();
		if(ls!=null)
		{
			session.setAttribute("key1", ls);
			session.setAttribute("key2",l);
		}
		return new ModelAndView("HomePage.definition","myregister",hm);
	}
	@RequestMapping(value="/second",method=RequestMethod.GET)
	public void afterFirst(HttpServletRequest request,HttpServletResponse response,HttpSession session)
	{	System.out.println("list in after is\t");
		String state=request.getParameter("statename");
		List l=citydao.getCity(state);
		session.setAttribute("key3",l);
		//System.out.println("list in after is\t"+l);
		String json = new Gson().toJson(l);
        response.setContentType("application/json");
        try {
			response.getWriter().write(json);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
       
      
	}
	@RequestMapping(value="/second",method=RequestMethod.POST)
	public ModelAndView afterSecond(HttpServletRequest request,HttpServletResponse response,HttpSession session)
	{  
		
		
		session.setAttribute("key6",request.getParameter("aircode"));
		session.setAttribute("key4",request.getParameter("state"));
		session.setAttribute("key5",request.getParameter("city"));
       // System.out.println(session.getAttribute("key4"));
       // System.out.println(session.getAttribute("key5"));
        
			return new ModelAndView("HomePage.definition","myregister",hm);
       
	}
	
	
	
	
	@RequestMapping(value="/VehicleSelection",method=RequestMethod.POST)
	public String getRecords(HttpSession session,HttpServletRequest request)
	{
		
		List<Cars> mylist=dao.fetchCars();
		//System.out.println(request.getParameter("pickdate"));
		//session.setAttribute("pickdate",request.getParameter("pickdate"));
		session.setAttribute("mylist", mylist);
		return "VehicleSelection.definition";
	}
	@RequestMapping(value="/location.do",method=RequestMethod.GET)
	public String getR(HttpSession session,HttpServletRequest request)
	{
		hm.setPickState(request.getParameter("state"));
		hm.setPickCity(request.getParameter("city"));
		
		 session.setAttribute("pickup1",request.getParameter("selectpick"));
			session.setAttribute("drop1",request.getParameter("selectdrop"));
			System.out.println("Date is "+request.getParameter("selectpick"));
			System.out.println("Date is "+request.getParameter("selectdrop"));
		
		
			
		//System.out.println(request.getParameter("rentDate"));
		System.out.println("homepage is\t"+hm);
		List list=locdao.getLocations(request.getParameter("city"));
		System.out.println(request.getParameter("city"));
		if(!list.isEmpty())
		{
			session.setAttribute("loc1", list);
		}
	
		System.out.println(list);
		return "Location.definition";
	}
	@RequestMapping(value="/location.do",method=RequestMethod.POST)
	public ModelAndView go(HttpSession session,HttpServletRequest request)
	{
		
		session.setAttribute("key4",request.getParameter("radios"));
		System.out.println(hm.toString());
		return new ModelAndView("HomePage.definition","myregister",hm);
	}
	
	
	
	
	
	
	
	
}














