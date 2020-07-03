package com.application.appkids.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PostCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long postid;
    private int categoryid;

    public Long getPostid() {
        return postid;
    }

    public void setPostid(Long postid) {
        this.postid = postid;
    }

    public int getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(int categoryid) {
        this.categoryid = categoryid;
    }
}
