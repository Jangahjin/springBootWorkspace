//package com.zeus.controller;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import com.zeus.dto.Member;
//
//import lombok.extern.slf4j.Slf4j;
//
//@Controller
//@Slf4j
//public class Spring2Controller {
////	1번 방식
//	@GetMapping(value = "/spring2/form1")
//	public String method1(Model model) {
//		return "spring2/form1";
//	}
////	2번 방식
//	@GetMapping(value = "/spring2/form2")
//	public void method2(Model model) {
//		log.info("/spring2/form1");		
//	}
////	3번 방식 -1
//	@GetMapping(value = "/spring2/form3")
//	@ResponseBody
//	public Member method3(Model model) {
//		log.info("/spring2/form1");
//		Member member = new Member();
//		return member;
//		
//	}
//		
////		3번 방식 -2
//		@GetMapping(value = "/spring2/form4")
//		public ResponseEntity<Member> method4(Model model) {
//			Member member = new Member();
//			log.info("/spring2/form1");
//			ResponseEntity<Member> entity = new ResponseEntity<>(member,HttpStatus.OK);
//			return entity;
//		
//		}
//}