package com.bgora.bgora.controller;

import com.bgora.bgora.pojo.Account;
import com.bgora.bgora.pojo.Answer;
import com.bgora.bgora.pojo.Question;
import com.bgora.bgora.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@Controller
public class AnswerController {
    @Autowired
    AnswerService answerService;

    @RequestMapping(value = "/answer", method= RequestMethod.POST)
    public String answer(Answer answer, Model model){
        String ans = answer.getComment();
        if (!ans.equals("")) {
            answer.setTime(new Date());
            int result = answerService.addComment(answer);
            if (result == 1) {
                model.addAttribute("error", "提交成功!");
            } else {
                model.addAttribute("error", "提交失败!");
            }
        }
        return "redirect:/home";
    }
    //根据qid查看comment
    @RequestMapping(value = "/selectByQid", method = RequestMethod.GET)
    @ResponseBody
    public List<String> selectByQid(@RequestParam("qid") int qid, Model model){
        System.out.println("bbbb");
        System.out.println("aaa"+qid);
        List<Answer> commentList = answerService.selectByQid(qid);
        Collections.reverse(commentList);
        List<String> list = new ArrayList<>();
        for (int i = 0; i < commentList.size(); i++) {
            list.add(commentList.get(i).getComment());
        }
        return list;
    }

}
