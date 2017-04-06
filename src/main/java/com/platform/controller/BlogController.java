package com.platform.controller;

import com.platform.domain.Blog;
import com.platform.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("blogger/blogs")
public class BlogController {
    @Autowired
    private BlogService blogService;

    @RequestMapping(method = RequestMethod.GET)
    public String blogInformation() {
        return "Welcome to new blooger site";
    }

    @RequestMapping(value = "{name}", method = RequestMethod.GET)
    public Blog getBlogInformation(@PathVariable String name) {
        return blogService.getBlogInfo(name);
    }

    @RequestMapping(value = "{name}", method = RequestMethod.DELETE)
    public void deleteBlog(@PathVariable String name) {
        blogService.deleteByName(name);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Blog createBlog(@RequestBody Blog blog) {
        return blogService.createBlog(blog);
    }

    @RequestMapping(value = "{name}", method = RequestMethod.PUT)
    public void updateBlog(@PathVariable String name, @RequestBody Blog blog){
        blogService.updateBlog(name,blog);
    }

}
