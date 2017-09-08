package com.java.spring;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

public class MyController implements org.springframework.web.servlet.mvc.Controller{

	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {

		return new ModelAndView("Welcome","sysDate",new Date());
	}	
}
