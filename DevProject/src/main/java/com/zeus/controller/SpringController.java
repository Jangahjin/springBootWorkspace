package com.zeus.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zeus.dto.Member;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class SpringController {

    @RequestMapping(value = "/spring/form1", method = RequestMethod.GET)
    public String springForm1(Model model) {
        log.info("/spring/form1");

        Member member = new Member();
        member.setUserId("hong");
        member.setUserName("홍길동");
        member.setPassword("123456");
        member.setEmail("zeus@nate.com");
        member.setIntroduction("안녕하세요 저는 홍길동 입니다."); 

        // 체크박스용 데이터 설정
     // List<CodeLabelValue> hobbyList = new ArrayList<>();
     // hobbyList.add(new CodeLabelValue("축구", "01"));
     // hobbyList.add(new CodeLabelValue("여행", "02"));
     // hobbyList.add(new CodeLabelValue("농구", "03"));
     // member.setHobbyList(hobbyList);
     // model.addAttribute("hobbyList", hobbyList);
        
        Map<String, String> hobbyMap = new LinkedHashMap<>();
        hobbyMap.put("축구", "01");
        hobbyMap.put("배구", "02");
        hobbyMap.put("농구", "03");
        // DTO에 맵 전달
        member.setHobbyMap(hobbyMap);
        
        //외국인유무
        member.setForeigner(true);
        
        //hobbyList2(UI 각 항목이 존재함)
        List<String> hobbyList2 = new ArrayList<>();
        hobbyList2.add("sports");
        hobbyList2.add("movie");
        member.setHobbyList2(hobbyList2);


        
        // 화면으로 데이터 전송
        model.addAttribute("member", member);

        return "spring/form1";
    }

    @RequestMapping(value = "/spring/register", method = RequestMethod.POST)
    @ResponseBody
    public Member springRegister(@ModelAttribute Member member) {
        log.info("/spring/register");
        // 사용자가 선택한 결과가 member.hobbyValue에 자동으로 담겨서 들어옵니다.
        return member;
    }
}