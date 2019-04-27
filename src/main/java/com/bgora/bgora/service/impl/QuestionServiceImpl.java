package com.bgora.bgora.service.impl;

import com.bgora.bgora.mapper.AccountMapper;
import com.bgora.bgora.mapper.QuestionMapper;
import com.bgora.bgora.pojo.Account;
import com.bgora.bgora.pojo.Question;
import com.bgora.bgora.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    QuestionMapper questionMapper;

    @Override
    public Integer addQuestion(Question question) {
        Integer result = questionMapper.insert(question);
        return result;
    }

    @Override
    public Question selectQuestionByQid(Integer qid) {
        return  questionMapper.selectQuestionByQid(qid);
    }

    @Override
    public List<Question> selectQuestionByAid(Integer aid) {
        return questionMapper.selectQuestionByAid(aid);
    }

}
