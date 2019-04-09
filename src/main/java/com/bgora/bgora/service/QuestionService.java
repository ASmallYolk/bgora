package com.bgora.bgora.service;

import com.bgora.bgora.pojo.Account;
import com.bgora.bgora.pojo.Question;

public interface QuestionService {
    //添加问题
    Integer addQuestion(Question question);

    //实现like_num增一
    boolean updateLikeNum(int qid);
}
