package com.bpjoshi.stickynotes.service;

public class WelcomeService {
	
	public static boolean validateUser(String name, String pass){
		if(name.equals("bpjoshi") && pass.equals("password")) return true;
		return false;
	}
}
