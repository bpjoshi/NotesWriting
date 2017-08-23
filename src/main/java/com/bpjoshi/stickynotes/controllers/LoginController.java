package com.bpjoshi.stickynotes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
		@RequestMapping(value="/login")
		//@ResponseBody
		public String sayHello(){
			return "Hello World!";
		}
		//It will give 404 error. Spring is searching for a view with name Hello World
		//We would like to return it as a text not as a view so add @ResponseBody
}
