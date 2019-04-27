package com.bgora.bgora.service;

import com.bgora.bgora.pojo.Account;
import com.bgora.bgora.pojo.Question;

import java.util.List;

public interface QuestionService {
    //添加问题
    Integer addQuestion(Question question);

    Question selectQuestionByQid(Integer qid);

    //查询一个account的问题
    List<Question> selectQuestionByAid(Integer aid);
}
