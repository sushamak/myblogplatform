package com.platform.service;

import com.platform.domain.Blog;
import com.platform.domain.Post;
import com.platform.repository.BlogRepository;
import com.platform.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostRepository postRepository;

    @Autowired
    private BlogRepository blogRepository;

    @Override
    public Post getPostInfo(String postId) {
        return postRepository.findOne(postId);
    }

    @Override
    public List<Post> getAllPosts(String blogId) {
        Blog blog = blogRepository.findById(blogId);
        return postRepository.findByBlog(blog);
    }

    @Override
    public void createPost(String blogId, Post post) {
        Blog blog = blogRepository.findById(blogId);
        post.setBlog(blog);
        post.setCreatedOn(new Date());
        post.setLastUpdated(new Date());
        postRepository.save(post);
    }

    @Override
    public Post updatePost(String blogId, String postId, Post postToUpdate) {
        Post post = postRepository.findById(postId);
        Blog blog = post.getBlog();
        if(blog != null && blog.getId() != null && blog.getId().equals(blogId)){
            postToUpdate.setBlog(blogRepository.findById(blogId));
           return postRepository.save(postToUpdate);
        }
        return null;
    }
}
