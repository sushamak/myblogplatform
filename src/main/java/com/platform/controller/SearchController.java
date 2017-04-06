package com.platform.controller;

import com.platform.domain.Post;
import com.platform.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("blogger/blogs")
public class SearchController {
    @Autowired
    private PostService postService;

    @RequestMapping(value = "/search")
    public List<Post> searchPost(@RequestParam("q") String query){
        return postService.searchPost(query);
    }
}
