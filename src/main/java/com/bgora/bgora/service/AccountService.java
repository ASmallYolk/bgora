package com.bgora.bgora.service;

import com.bgora.bgora.pojo.Account;

import java.util.List;

public interface AccountService {

    //添加账户
    Integer addAccount(Account account);

    //登录
    Account login(Account account);

    //查询所有用户
    List<Account> accountList();

    //查询一个account
    public Account equrySingleAccount(Account account);
}
