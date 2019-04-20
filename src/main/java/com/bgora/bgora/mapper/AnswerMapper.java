package com.bgora.bgora.mapper;

import com.bgora.bgora.pojo.Answer;
import com.bgora.bgora.utils.MyMapper;

import java.util.List;

public interface AnswerMapper extends MyMapper<Answer> {
    //根据qid来查找comment
    List<Answer> selectByQid(Integer qid);
}