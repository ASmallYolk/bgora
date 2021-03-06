package com.bgora.bgora.controller;

import com.bgora.bgora.pojo.Account;
import com.bgora.bgora.pojo.Question;
import com.bgora.bgora.service.HomeService;
import com.bgora.bgora.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collections;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    HomeService homeService;

    @Autowired
    QuestionService questionService;

    @RequestMapping("/home")
    public String home1(Model model){
        List<Question> QuestionList = homeService.questionList();

        Collections.reverse(QuestionList);
        model.addAttribute("questionList",QuestionList);
        System.out.println(QuestionList.size());
        return "home";
    }

    @RequestMapping("/details")
    public String details(@RequestParam(name = "qid") Integer qid,Model model){

        Question question = questionService.selectQuestionByQid(qid);
        model.addAttribute("question",question);
        List<Account> lists = homeService.answerByQid(qid);
        Collections.reverse(lists);
        model.addAttribute("lists",lists);
        return "details";
    }
}
