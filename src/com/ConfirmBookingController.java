package com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConfirmBookingController 
{
	@Autowired
	ConfirmBookingDAO dao;
	
	@RequestMapping(value="/ConfirmBooking",method=RequestMethod.POST)
	public ModelAndView getRecords(Register obj)
	{
	
		return new ModelAndView("ConfirmBooking","temp",obj);
	}
	
	
}
