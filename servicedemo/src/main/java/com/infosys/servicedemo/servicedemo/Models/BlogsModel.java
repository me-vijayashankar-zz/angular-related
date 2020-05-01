package com.infosys.servicedemo.servicedemo.Models;

import java.util.Date;

public class BlogsModel {
    public String title;
    public String intro;
    public String body;
    public String conclusion;
    public String writtenBy;
    public Date postedOn;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public String getWrittenBy() {
        return writtenBy;
    }

    public void setWrittenBy(String writtenBy) {
        this.writtenBy = writtenBy;
    }

    public Date getPostedOn() {
        return postedOn;
    }

    public void setPostedOn(Date postedOn) {
        this.postedOn = postedOn;
    }

    public BlogsModel(String title, String intro, String body, String conclusion, String writtenBy, Date postedOn) {
        this.title = title;
        this.intro = intro;
        this.body = body;
        this.conclusion = conclusion;
        this.writtenBy = writtenBy;
        this.postedOn = postedOn;
    }
}