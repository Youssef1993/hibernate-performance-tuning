package com.hibernate.demo.performancetuning.service;

import com.hibernate.demo.performancetuning.entities.Post;
import com.hibernate.demo.performancetuning.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class PostService {

    private final PostRepository repository;

    public List<Post> getPostsAndAuthorsByDateInterval(LocalDateTime min, LocalDateTime max) {
        return repository.findAllByDateIntervalJoinFetchAuthor(min, max);
    }

    public List<Post> getPostsByDateInterval(LocalDateTime min, LocalDateTime max) {
        return repository.findAllByDateInterval(min, max);
    }

    public List<Post> getAllPosts() {
        return repository.findAll();
    }
}
