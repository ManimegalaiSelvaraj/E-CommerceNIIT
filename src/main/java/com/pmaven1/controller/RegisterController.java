package com.pmaven1.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.pmaven1.model.Register;
import com.pmaven1.serviceimpl.RegisterImpl;

@Controller("registercontroller")
public class RegisterController 
{
	
	@Autowired
	RegisterImpl rdao;
		@RequestMapping(value="Register", method=RequestMethod.GET)
	public ModelAndView getLogin(@ModelAttribute("Register")Register register) 
	{
			System.out.println("Register");	
			ModelAndView model=new ModelAndView("Register");
			return model;
	}
	
	@RequestMapping(value="Register", method=RequestMethod.POST)
	public ModelAndView Success(Register reg, Model m)
	{
		    reg.setEnabled(false);
			rdao.adduser(reg);
			ModelAndView model=new ModelAndView("login","Register", new Register());
			return model;
	}
	
}
	