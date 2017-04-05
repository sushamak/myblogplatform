package com.platform.controller;

import com.platform.domain.Post;
import com.platform.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("blogger/blogs/{blogId}/posts")
public class PostController {
    @Autowired
    private PostService postService;

    @RequestMapping
    public List<Post> getAllPost(@PathVariable String blogId){
        return postService.getAllPosts(blogId);
    }
    @RequestMapping(value = "{postId}")
    public Post getPostInfo(@PathVariable String postId){
        return postService.getPostInfo(postId);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void createPost(@PathVariable String blogId, @RequestBody Post post){
        postService.createPost(blogId, post);
    }

    @RequestMapping(value = "{postId}", method = RequestMethod.PUT)
    public Post updatePost(@PathVariable String blogId, @PathVariable String postId, @RequestBody Post post){
        return postService.updatePost(blogId, postId, post);
    }
}
