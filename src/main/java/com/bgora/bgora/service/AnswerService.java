package com.bgora.bgora.service;

import com.bgora.bgora.pojo.Account;
import com.bgora.bgora.pojo.Answer;
import com.bgora.bgora.pojo.Question;

public interface AnswerService {
    //添加评论
    Integer addComment(Answer answer);
}
