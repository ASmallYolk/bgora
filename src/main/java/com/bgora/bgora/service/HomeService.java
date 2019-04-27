package com.bgora.bgora.service;

import com.bgora.bgora.pojo.Account;
import com.bgora.bgora.pojo.Question;

import java.util.List;

public interface HomeService {

    List<Question> questionList();

    List<Account> answerByQid(Integer qid);

}
