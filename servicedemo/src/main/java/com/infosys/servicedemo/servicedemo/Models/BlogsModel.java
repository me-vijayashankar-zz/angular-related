package com.infosys.servicedemo.servicedemo.Models;

import java.util.Date;

public class BlogsModel {
	public int id;
    public String title;
    public String intro;
    public String body;
	public String conclusion;
    public String writtenBy;
    public Date postedOn;
    
    public BlogsModel(int id, String title, String intro, String body, String conclusion, String writtenBy,
			Date postedOn) {
		super();
		this.id = id;
		this.title = title;
		this.intro = intro;
		this.body = body;
		this.conclusion = conclusion;
		this.writtenBy = writtenBy;
		this.postedOn = postedOn;
	}
    public BlogsModel() {
    	
    }
}