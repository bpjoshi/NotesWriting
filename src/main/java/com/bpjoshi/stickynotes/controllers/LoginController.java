package com.bpjoshi.stickynotes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
		@RequestMapping(value="/login1")
		//@ResponseBody
		public String sayHello(){
			return "Hello World!";
		}
		//It will give 404 error. Spring is searching for a view with name Hello World
		//We would like to return it as a text not as a view so add @ResponseBody
		//@Response body return the String back to browser
		/*@RequestMapping(value="/login")
		public String loginLink(){
			return "login";
		}*/
		
		//if we just return login.. it will become circular reponse
		//..so we will have to configure view resolver
		@RequestMapping(value = "/login", method = RequestMethod.GET)
		public String showLoginPage() {
			System.out.println("In login");
			return "login";
		}
}
