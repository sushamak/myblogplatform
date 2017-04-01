package com.platform.controller;

import com.platform.domain.Blog;
import com.platform.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/blogger")
public class HomeController {
    @Autowired
    private BlogService blogService;

    public String blogInformation() {
        return "Welcome to new blooger site";
    }

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public Blog getBlogInformation(@PathVariable String name) {
        return blogService.getBlogInfo(name);
    }


}
