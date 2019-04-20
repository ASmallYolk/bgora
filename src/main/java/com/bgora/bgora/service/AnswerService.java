package com.bgora.bgora.service;

import com.bgora.bgora.pojo.Account;
import com.bgora.bgora.pojo.Answer;
import com.bgora.bgora.pojo.Question;

import java.util.List;

public interface AnswerService {
    //添加评论
    Integer addComment(Answer answer);
    //查看评论
    List<Answer> selectByQid(Integer qid);
}
