package com.platform.domain;

import org.springframework.data.annotation.Id;

import java.util.Date;
public class Blog {

    @Id
    private String id;
    private String name;
    private String author;
    private String description;
    private Date published;
    private Date lastUpdated;

    public Blog(String id, String name, String author, String description, Date published, Date lastUpdated) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.description = description;
        this.published = published;
        this.lastUpdated = lastUpdated;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getPublished() {
        return published;
    }

    public void setPublished(Date published) {
        this.published = published;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", description='" + description + '\'' +
                ", published=" + published +
                ", lastUpdated=" + lastUpdated +
                '}';
    }

}
