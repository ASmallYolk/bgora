package com.bgora.bgora.controller;

import com.bgora.bgora.pojo.Account;
import com.bgora.bgora.pojo.Question;
import com.bgora.bgora.service.AccountService;
import com.bgora.bgora.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

//    @RequestMapping("/recive/{devType}/{cmdLogId}")
//    public void reciveCameraCapture(@PathVariable("devType") String devType, @PathVariable("cmdLogId") String cmdLogId,
//                                    @RequestParam("captureImg") MultipartFile captureImg,
//                                    @RequestParam(value = "cameraPreviewId", required = false) Long cameraPreviewId,
//                                    @RequestParam("token") String token, HttpServletRequest request, HttpServletResponse response) {
//        if (captureImg == null) {
//            return;
//        }
//
//        // 保存图片
//        String filename = captureImg.getOriginalFilename();
//        // 文件后缀名
//        String prefix = filename.substring(filename.lastIndexOf(".") + 1);
//        String destFilename = UUID.randomUUID().toString().replace("-", "") + "." + prefix;
//
//        File fileUrl = new File(uploadFolder + captureImagePath + devType);
//
//        if (!fileUrl.exists()) {
//            fileUrl.mkdirs();
//        }
//
//        File destImage = new File(fileUrl, destFilename);
//
//        logger.debug("图片保存地址为：" + destImage);
//        try {
//            captureImg.transferTo(destImage);
//        } catch (IOException e) {
//            logger.error("图片保存失败", e);
//        }
//    }



}
