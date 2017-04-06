package com.platform.service;


import com.platform.domain.Blog;
import com.platform.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogRepository blogRepository;

    @Override
    public Blog getBlogInfo(String name) {
        return blogRepository.findByName(name);
    }

    @Override
    public void deleteByName(String name) {
        blogRepository.deleteByName(name);
    }

    @Override
    public Blog createBlog(Blog blog) {
        blog.setBlogId(blog.getName().toLowerCase());
       return blogRepository.save(blog);
    }

    @Override
    public void updateBlog(String name, Blog blog) {
        Blog dbBlog = blogRepository.findByBlogId(name.toLowerCase());
        if (dbBlog != null) {
            dbBlog.setBlogId(blog.getBlogId());
            dbBlog.setAuthor(blog.getAuthor());
            dbBlog.setPublished(blog.getPublished());
            dbBlog.setDescription(blog.getDescription());
            dbBlog.setName(blog.getName());
            dbBlog.setLastUpdated(new Date());
            blogRepository.save(blog);
        }
    }
}
