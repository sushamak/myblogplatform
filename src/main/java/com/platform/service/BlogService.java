package com.platform.service;

import com.platform.domain.Blog;

public interface BlogService {

    Blog getBlogInfo(String name);

    void deleteByName(String name);

    Blog createBlog(Blog blog);

    void updateBlog(String name, Blog blog);
}
