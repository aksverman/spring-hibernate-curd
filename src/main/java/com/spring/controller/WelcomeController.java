package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController 
{
	@RequestMapping(value="/test")
	public	ModelAndView	sayWelcomeMsg()
	{
		ModelAndView	mav = new	ModelAndView("welcome","msg","Welcome to Spring MVC");
		return mav;
	}
	
}
