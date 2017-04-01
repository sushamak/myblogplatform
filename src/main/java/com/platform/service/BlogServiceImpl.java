package com.platform.service;


import com.platform.domain.Blog;
import com.platform.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogRepository blogRepository;

    @Override
    public Blog getBlogInfo(String name){
        return blogRepository.findByName(name);
    }
}
