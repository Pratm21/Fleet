package com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
@RequestMapping("/sitemap")
public class SiteMapController
{
	@RequestMapping(method = RequestMethod.GET)
	public String before()
	{
 		return "sitemap.definition";
	}
	
}
