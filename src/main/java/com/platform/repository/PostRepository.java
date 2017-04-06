package com.platform.repository;

import com.platform.domain.Blog;
import com.platform.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface PostRepository extends MongoRepository<Post, String>{
    List<Post> findByBlog(Blog blog);

    Post findByPostId(String postId);

    @Query(
            value = "{$text:{$search:?0} }",
            fields = "{'_id':1, 'title': 1, 'description': 1, 'content':1}"
    )
    List<Post> searchPost(String query);
}
