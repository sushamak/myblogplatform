package com.platform.domain;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class Post {
    @Id
    private String postId;
    private String title;
    private String description;
    private String content;
    private Date createdOn;
    private Date lastUpdated;
    private Blog blog;

    public Post() {
    }

    public Post(String postId, String title, String description, String content, Date createdOn, Date lastUpdated, Blog blog) {
        this.postId = postId;
        this.title = title;
        this.description = description;
        this.content = content;
        this.createdOn = createdOn;
        this.lastUpdated = lastUpdated;
        this.blog = blog;
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
