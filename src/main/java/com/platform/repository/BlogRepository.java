package com.platform.repository;

import com.platform.domain.Blog;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BlogRepository  extends MongoRepository<Blog, String>{
    Blog findById(String id);
    Blog findByName(String name);
}
