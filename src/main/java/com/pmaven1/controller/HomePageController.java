package com.pmaven1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller("homepagecontroller")
public class HomePageController 
{

	@RequestMapping(value="Register")
	public String Register()
	{
		System.out.println("Register");
		return "Register";
	}
	
	@RequestMapping(value="cart1", method=RequestMethod.GET)
    public ModelAndView mycartpage(@RequestParam("pid") int pid)
    {
		  ModelAndView m=new ModelAndView("cart");
	       // m.addObject("cart1",c5);
	       // m.addObject("grandtotal",grandtotal);
	        return m;
    }

 @RequestMapping(value="Aboutus")
 
 public String about()
 {
	 System.out.println("Aboutus");
	 return "Aboutus";
 }
	 @RequestMapping(value="Contact")
	 
	 public String contact()
	 {
		 System.out.println("contact");
		 return "Contact";
	 }
	 
	@RequestMapping(value="login")
	public String login()
	{
		System.out.println("Login");
		return "login";
	}
	}

	