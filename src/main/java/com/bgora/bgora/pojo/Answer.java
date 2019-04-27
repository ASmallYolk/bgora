package com.bgora.bgora.pojo;

import java.util.Date;
import javax.persistence.*;

public class Answer {
    /**
     * 评论
     */
    private Integer anid;

    /**
     * 用户ID
     */
    private Integer aid;

    /**
     * 问题ID
     */

    private Integer qid;

    private Date time;

    /**
     * 评论
     */
    private String comment;

    /**
     * 获取评论
     *
     * @return anid - 评论
     */
    public Integer getAnid() {
        return anid;
    }

    /**
     * 设置评论
     *
     * @param anid 评论
     */
    public void setAnid(Integer anid) {
        this.anid = anid;
    }

    /**
     * 获取用户ID
     *
     * @return aid - 用户ID
     */
    public Integer getAid() {
        return aid;
    }

    /**
     * 设置用户ID
     *
     * @param aid 用户ID
     */
    public void setAid(Integer aid) {
        this.aid = aid;
    }

    /**
     * 获取问题ID
     *
     * @return qid - 问题ID
     */
    public Integer getQid() {
        return qid;
    }

    /**
     * 设置问题ID
     *
     * @param qid 问题ID
     */
    public void setQid(Integer qid) {
        this.qid = qid;
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

    /**
     * 获取评论
     *
     * @return comment - 评论
     */
    public String getComment() {
        return comment;
    }

    /**
     * 设置评论
     *
     * @param comment 评论
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "anid=" + anid +
                ", aid=" + aid +
                ", qid=" + qid +
                ", time=" + time +
                ", comment='" + comment + '\'' +
                '}';
    }
}