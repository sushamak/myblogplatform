package com.platform.repository;

import com.platform.domain.Blog;
import com.platform.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PostRepository extends MongoRepository<Post, String>{
    List<Post> findByBlog(Blog blog);

    Post findById(String postId);
}
