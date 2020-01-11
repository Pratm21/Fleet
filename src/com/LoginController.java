package com;
import java.util.Iterator;
import java.util.List;





import javax.validation.Valid;

//import org.apache.jasper.tagplugins.jstl.core.ForEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Component
@Controller
@RequestMapping("/Login")
public class LoginController
{
	@Autowired
	LoginDAO logindao;
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView processSubmit(@Valid @ModelAttribute("mylogin") Login login,BindingResult result)
		{
		if(result.hasErrors())
		{
			return new ModelAndView("Login", "mylogin", login);
		}
		else
		{
			List<Register> flag=logindao.checkLogin(login);
			Register rg=new Register();
			Iterator<Register> itr=flag.iterator();
			while(itr.hasNext())
			{
	             rg= itr.next();
			}
			if(rg!=null)
				return new ModelAndView("Register", "myregister", rg);
			else
				return new ModelAndView("Login", "mylogin", login);
		}
	}
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView before()
	{
		Login login=new Login();
		return new ModelAndView("Login","mylogin",login);
 		
	}
}









