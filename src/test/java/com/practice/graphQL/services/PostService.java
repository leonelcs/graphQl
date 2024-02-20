package com.practice.graphQL.services;

import com.practice.graphQL.model.Post;
import com.practice.graphQL.repositories.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    public Post createPost(Post post) {
        return postRepository.saveAndFlush(post);
    }

    public List<Post> getPosts() {
        return postRepository.findAll();
    }
}
