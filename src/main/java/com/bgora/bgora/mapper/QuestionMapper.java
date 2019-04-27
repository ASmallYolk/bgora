package com.bgora.bgora.mapper;

import com.bgora.bgora.pojo.Question;
import com.bgora.bgora.utils.MyMapper;

import java.util.List;

public interface QuestionMapper extends MyMapper<Question> {
    Question selectQuestionByQid(Integer qid);

    List<Question> selectQuestionByAid(Integer aid);
}