package com.platform.service;


import com.platform.domain.Blog;
import org.springframework.stereotype.Service;

import java.util.Date;
@Service
public class BlogServiceImpl implements BlogService {

    @Override
    public Blog getBlogInfo(String name){
        Blog blog = new Blog();
        blog.setName(name);
        blog.setId("1");
        blog.setAuthor("Bob");
        blog.setDescription("Bob's first blog");
        blog.setPublished(new Date());
        blog.setLastUpdated(new Date());
        return blog;
    }
}
