package com.bgora.bgora.pojo;

import java.util.Date;
import javax.persistence.*;

public class Question {
    private Integer qid;

    private String image;

    private String question;

    @Column(name = "like_num")
    private Integer likeNum;

    private Date time;

    /**
     * @return qid
     */
    public Integer getQid() {
        return qid;
    }

    /**
     * @param qid
     */
    public void setQid(Integer qid) {
        this.qid = qid;
    }

    /**
     * @return image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * @return question
     */
    public String getQuestion() {
        return question;
    }

    /**
     * @param question
     */
    public void setQuestion(String question) {
        this.question = question;
    }

    /**
     * @return like_num
     */
    public Integer getLikeNum() {
        return likeNum;
    }

    /**
     * @param likeNum
     */
    public void setLikeNum(Integer likeNum) {
        this.likeNum = likeNum;
    }

    /**
     * @return time
     */
    public Date getTime() {
        return time;
    }

    /**
     * @param time
     */
    public void setTime(Date time) {
        this.time = time;
    }
}