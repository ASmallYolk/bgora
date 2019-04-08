package com.bgora.bgora.controller;

import com.bgora.bgora.pojo.Question;
import com.bgora.bgora.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collections;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    HomeService homeService;

    @RequestMapping("/home")
    public String home1(Model model){
        List<Question> QuestionList = homeService.questionList();
        Collections.reverse(QuestionList);
        model.addAttribute("questionList",QuestionList);
        return "home";
    }



}
