package com.platform.service;

import com.platform.domain.Post;

import java.util.List;

public interface PostService {

    Post getPostInfo(String postId);

    List<Post> getAllPosts(String blogId);

    Post createPost(String blogId, Post post);

    Post updatePost(String blogId, String postId, Post post);

    List<Post> searchPost(String query);
}
