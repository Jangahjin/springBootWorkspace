package com.zeus.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.zeus.dto.Member;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class MemberController {
// 1. 문자열 한 개 전송(string), 2. 객체전송(member), 3.List<객체>	
	@RequestMapping(value = "/Member/model01", method = RequestMethod.GET)
    public String model01(Member member, RedirectAttributes rttr)  {
		log.info("member="+member);
		rttr.addFlashAttribute("member" + member);
        return "redirect:/Member/result";
    }
	@RequestMapping(value = "/Member/result", method = RequestMethod.GET)
    public String result()  {
		log.info("result");
        return "Member/result";
    }
}