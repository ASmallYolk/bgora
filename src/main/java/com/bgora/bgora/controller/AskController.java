package com.bgora.bgora.controller;

import com.bgora.bgora.pojo.Account;
import com.bgora.bgora.pojo.Question;
import com.bgora.bgora.service.AccountService;
import com.bgora.bgora.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Controller
public class AskController {

    @Autowired
    QuestionService questionService;

    @RequestMapping("/ask")
    public String ask(){
        return "ask";
    }

    @RequestMapping(value = "/updateLikeNum", method = RequestMethod.GET)
    public String updateLikeNum(@RequestParam("qid") int qid){
        System.out.println(qid);
        boolean result = questionService.updateLikeNum(qid);

        return "redirect:/home";
    }

    @RequestMapping(value = "/question",method = RequestMethod.POST)
    public String question1(Question question, Model model){
        question.setTime(new Date());
        int result = questionService.addQuestion(question);
        if (result == 1) {
            model.addAttribute("error", "提交成功!");
        } else {
            model.addAttribute("error", "提交失败!");
        }

        return "redirect:/home";
    }


}
