/**
 * 
 */
package com.jgsudhakar.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Sudhakar Tangellapalli
 */
@Controller
public class LoginController {

	@RequestMapping(value="/authenticate",method=RequestMethod.GET)
	public String authenticate (HttpServletRequest request) {
		
		String uname = request.getParameter("uname");
		String password = request.getParameter("password");
		if(uname.equalsIgnoreCase("sudhakar") && password.equalsIgnoreCase("sudhakar"))
			return "success";

		return "index";
	}
}
