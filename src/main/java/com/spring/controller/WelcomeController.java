package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController 
{
	@RequestMapping(value="/test")
	public	ModelAndView	sayWelcome()
	{
		ModelAndView	mav = new	ModelAndView("welcome","msg","welcome to spring mvc");
		return mav;
	}
	
}
