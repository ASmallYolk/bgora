package com.bgora.bgora.controller;

import com.bgora.bgora.pojo.Account;
import com.bgora.bgora.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class AccountController {

    @Autowired
    AccountService accountService;

    @RequestMapping("/doLogin")
    public String doLogin(){
        return "login_register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(Account account,Model model){
        List<Account> accountList = accountService.accountList();
        boolean isExist = false;
        for (int i = 0; i < accountList.size(); i++) {
            if (accountList.get(0).getEmail().equals(account.getEmail()))
                isExist = true;
        }
        if (isExist){
            model.addAttribute("error", "邮箱已存在!");
        }else {
            int result = accountService.addAccount(account);
            if (result == 1){
                model.addAttribute("error", "注册成功!");
            } else {
                model.addAttribute("error", "注册失败!");
            }
        }
        return "redirect:/doLogin";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(Account account, Model model, HttpSession session){
        Account user = accountService.login(account);
        if (user != null) {
            session.setAttribute("user", user);
            return "redirect:/home";
        } else {
            model.addAttribute("error", "用户名或密码错误，请重新登录！");
            return "/login_register";
        }
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.setAttribute("user", null);
        return "redirect:/home";
    }
}


