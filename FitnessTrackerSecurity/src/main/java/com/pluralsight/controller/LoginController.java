package com.pluralsight.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login(ModelMap model)
	{
		System.out.println("In Login Method");
		return "login";
	}
	
	@RequestMapping(value="/loginFailed", method=RequestMethod.GET)
	public String loginFailed(ModelMap model)
	{
		System.out.println("In Login Failed Method");
		model.addAttribute("error", "true");
		return "login";
	}
	
	@RequestMapping(value="/logout", method=RequestMethod.GET)
	public String logout(ModelMap model)
	{
		System.out.println("In Logout Method");
		
		return "logout";
	}
	
	@RequestMapping(value="/403", method=RequestMethod.GET)
	public String unauthorized(ModelMap model)
	{
		System.out.println("In 403 Method");
		
		return "403";
	}

}
