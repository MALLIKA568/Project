package com.niit.OnlineShoppings.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController
{

	@RequestMapping("/")
	public  ModelAndView index()
	{
		
		ModelAndView mv=new ModelAndView("page");
		
		
		mv.addObject("greeting", "Welcome to NIIT ");
		
		return mv;
		
		
	}
	
	
}
