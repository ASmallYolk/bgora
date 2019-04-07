package com.bgora.bgora.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AskController {

    @RequestMapping("/ask")
    public String ask(){
        return "ask";
    }
}
