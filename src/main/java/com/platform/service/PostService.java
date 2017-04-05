package com.platform.service;

import com.platform.domain.Post;

import java.util.List;

public interface PostService {

    Post getPostInfo(String postId);

    List<Post> getAllPosts(String blogId);

    void createPost(String blogId, Post post);

    Post updatePost(String blogId, String postId, Post post);
}
