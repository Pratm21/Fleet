package com;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
@Component
public class RegisterValidator implements Validator {

	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		System.out.println("Inside supports method");
		return Register.class.equals(arg0);
	}

	@Override
	public void validate(Object arg0, Errors arg1) {
		// TODO Auto-generated method stub
		Register register=(Register)arg0;
		if(!register.getConfirmPassword().equalsIgnoreCase(register.getPassword()))
			{
				arg1.rejectValue("confirmpassword","not_match","password and confirm password do not match");
			}
	}

}







