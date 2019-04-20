package com.bgora.bgora.service.impl;

import com.bgora.bgora.mapper.AccountMapper;
import com.bgora.bgora.mapper.AnswerMapper;
import com.bgora.bgora.mapper.QuestionMapper;
import com.bgora.bgora.pojo.Account;
import com.bgora.bgora.pojo.Answer;
import com.bgora.bgora.pojo.Question;
import com.bgora.bgora.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerServiceImpl implements AnswerService {
    @Autowired
    AnswerMapper answerMapper;

    @Override
    public Integer addComment(Answer answer) {
        Integer result = answerMapper.insert(answer);
        return result;
    }

    @Override
    public List<Answer> selectByQid(Integer qid) {
       List<Answer> comments = answerMapper.selectByQid(qid);
       return  comments;
    }


}
