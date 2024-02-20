package com.practice.graphQL.controllers;

import com.practice.graphQL.model.Post;
import com.practice.graphQL.services.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.UUID;


@RequiredArgsConstructor
@Controller
public class PostController {


    final PostService postService;

    @MutationMapping
    public Post createPost(@Argument String title, @Argument String category, @Argument String authorId) {
        Post post = new Post(UUID.randomUUID().toString(), title, category, authorId);
        return postService.createPost(post);
    }

    @QueryMapping
    @SchemaMapping(typeName = "Query", field = "posts")
    public List<Post> posts() {
        return postService.getPosts();
    }
}
