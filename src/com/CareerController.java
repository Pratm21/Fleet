package com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
@RequestMapping("/career")
public class CareerController
{
	@RequestMapping(method = RequestMethod.GET)
	public String before()
	{
 		return "career.definition";
	}
	
}
