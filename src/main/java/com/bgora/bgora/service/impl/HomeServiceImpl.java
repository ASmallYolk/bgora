package com.bgora.bgora.service.impl;

import com.bgora.bgora.mapper.QuestionMapper;
import com.bgora.bgora.pojo.Question;
import com.bgora.bgora.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeServiceImpl implements HomeService {

    @Autowired
    QuestionMapper questionMapper;

    @Override
    public List<Question> questionList() {
        return questionMapper.selectAll();
    }
}
