package com.zeus.controller;

import org.apache.commons.logging.Log;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date; 
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class HomeController {
	// http://192.168.0.9/8080/home 요청을 하면 여기서 받는다.
	// 1) get 방식 2) /home 요청한다. 3) 해당된 함수에서 처리하고 4)return "home"화면을 보여줘야 한다.
	@RequestMapping(value = "/home")
	public String home() {
		Date data = new Date();
		log.info(String.format("접속시간:%s ",data.toString()));
		return "home";

	}

}
