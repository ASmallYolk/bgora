package com.bgora.bgora.service.impl;

import com.bgora.bgora.mapper.AccountMapper;
import com.bgora.bgora.mapper.QuestionMapper;
import com.bgora.bgora.pojo.Account;
import com.bgora.bgora.pojo.Question;
import com.bgora.bgora.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountMapper accountMapper;


    @Override
    public Integer addAccount(Account account) {
        Account tempAccount = new Account();
        tempAccount.setEmail(account.getEmail());
        Account exitsAccount = equrySingleAccount(tempAccount);

        if (exitsAccount != null){
            return -1;
        } else {
            Integer result = accountMapper.insert(account);
            return result;
        }
    }

    @Override
    public Account login(Account account) {
        Account user = accountMapper.selectOne(account);
        return user;
    }

    @Override
    public List<Account> accountList() {
        return accountMapper.selectAll();
    }

    @Override
    public Account equrySingleAccount(Account account) {
        return accountMapper.selectOne(account);

    }



}
