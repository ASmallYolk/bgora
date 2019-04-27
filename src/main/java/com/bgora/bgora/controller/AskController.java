package com.bgora.bgora.controller;

import com.bgora.bgora.pojo.Account;
import com.bgora.bgora.pojo.Question;
import com.bgora.bgora.service.AccountService;
import com.bgora.bgora.service.QuestionService;
import com.bgora.bgora.utils.CustomConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

@Controller
public class AskController {

    @Autowired
    QuestionService questionService;

    @RequestMapping("/ask")
    public String ask(){
        return "ask";
    }

    @RequestMapping(value = "/question",method = RequestMethod.POST)
    public String question1(Question question, @RequestParam("file") MultipartFile file, Model model) throws Exception{
        question.setTime(new Date());
        String fileName = file.getOriginalFilename();
        String filePath = ClassUtils.getDefaultClassLoader().getResource("").getPath() + CustomConstant.IMAGE_SAVE_PATH;

        String imgPath = filePath + fileName;

        question.setImage(fileName);
        File dest = new File(imgPath);
        file.transferTo(dest);
        int result = questionService.addQuestion(question);
        if (result == 1) {
            model.addAttribute("error", "提交成功!");
        } else {
            model.addAttribute("error", "提交失败!");
        }

        return "redirect:/home";
    }


}
