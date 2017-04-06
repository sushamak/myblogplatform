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
        Blog blog = blogRepository.findByBlogId(blogId);
        return postRepository.findByBlog(blog);
    }

    @Override
    public Post createPost(String blogId, Post post) {
        Blog blog = blogRepository.findByBlogId(blogId);
        post.setBlog(blog);
        post.setCreatedOn(new Date());
        post.setLastUpdated(new Date());
        return postRepository.save(post);
    }

    @Override
    public Post updatePost(String blogId, String postId, Post postToUpdate) {
        Post post = postRepository.findByPostId(postId);
        Blog blog = post.getBlog();
        if(blog != null && blog.getBlogId() != null && blog.getBlogId().equals(blogId)){
            postToUpdate.setBlog(blogRepository.findByBlogId(blogId));
           return postRepository.save(postToUpdate);
        }
        return null;
    }

    @Override
    public List<Post> searchPost(String query) {
        return postRepository.searchPost(query);
    }
}
