package com.pmaven1.controller;
import java.util.Collection;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pmaven1.DAO.RegisterDAO;
import com.pmaven1.model.AddProduct;
import com.pmaven1.model.UserCredential;

@Controller
public class LoginPageController {

	
	@Autowired
	 RegisterDAO registerdao;

	//@SuppressWarnings("unchecked")
		//@SuppressWarnings("unchecked")
		@RequestMapping(value="/login_session_attributes")
		public String login_session_attributes(HttpSession session,Model model) {
			String page=null;
			boolean loggedIn=true;
			System.out.println("Spring Security");
			String name = SecurityContextHolder.getContext().getAuthentication().getName();
			//UserCredential user = registerdao.getUserById(userid);
			session.setAttribute("name",name);
			//session.setAttribute("password", user.getPassword());
			session.setAttribute("LoggedIn", "true");

			Collection<GrantedAuthority> authorities = (Collection<GrantedAuthority>) SecurityContextHolder.getContext().getAuthentication().getAuthorities();
			//String page="";
			//String role="ROLE_USER";
			for (GrantedAuthority authority : authorities) 
			{
			  
			     if (authority.getAuthority().equals("ROLE_USER")) 
			     {
			    	// session.setAttribute("UserLoggedIn", "true");
			    	 
			 	     page="/productlist";
			    	 //session.setAttribute("cartsize",cartDAO.cartsize((int)session.getAttribute("userId")));
			     }
			     else 
			     {
			    	 session.setAttribute("admin", "true");
				     page="/admin";
				     break;
			    }
			}
			return page;
		}
       
		
	

	   //@RequestMapping(value="product")
		//public String product()
		//{
			//System.out.println("product");
			//return "product";
		//}

}
