package com.zeus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class Membercontroller {
	
	@RequestMapping(value ="/Member/model01", method = RequesMethod.GET)
	public String model01(Model model) {
		
		model.addAttribute("userId","123456");
		
		return "Member/model01"
	}
	

}
