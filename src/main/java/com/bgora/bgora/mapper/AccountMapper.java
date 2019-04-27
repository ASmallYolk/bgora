package com.bgora.bgora.mapper;

import com.bgora.bgora.pojo.Account;
import com.bgora.bgora.utils.MyMapper;

import java.util.List;

public interface AccountMapper extends MyMapper<Account> {

    List<Account> selectCommentByQid(Integer qid);
}