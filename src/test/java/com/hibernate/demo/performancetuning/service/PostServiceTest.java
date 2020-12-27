package com.hibernate.demo.performancetuning.service;

import com.hibernate.demo.performancetuning.entities.Comment;
import com.hibernate.demo.performancetuning.entities.Post;
import com.hibernate.demo.performancetuning.entities.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;

@SpringBootTest
class PostServiceTest {

    @Autowired
    private PostService postService;

    @Test
    @Transactional(readOnly = true)
    void testGetPostsByInterval_shouldGetPostsInOneQuery() {
        LocalDateTime min = LocalDateTime.of(2010, Month.JANUARY, 1, 0, 0);
        LocalDateTime max = LocalDateTime.now();

        List<Post> posts=  postService.getPostsAndAuthorsByDateInterval(min, max);
        for (Post post : posts) {
            System.out.printf(" --- Post Title : %s  , written by %s --- %n", post.getTitle(), post.getAuthor().getName());
        }
    }
    
    @Test
    @Transactional(readOnly = true)
    void testGetPostsByInterval_shouldGetPostsRaisingNPlusOneQueries() {
        LocalDateTime min = LocalDateTime.of(2010, Month.JANUARY, 1, 0, 0);
        LocalDateTime max = LocalDateTime.now();
        List<Post> posts = postService.getPostsByDateInterval(min, max);
        for (Post post : posts) {
            System.out.printf(" --- Post Title : %s written by %s  --- %n", post.getTitle(), post.getAuthor().getName());
        }
    }

    @Test
    @Transactional(readOnly = true)
    void testGetAllPosts_shouldGetCommentsAndTagsUsingSubSelect() {
        List<Post> posts = postService.getAllPosts();
        for (Post post : posts) {
            System.out.println(post.getTitle());
            System.out.println("## Comments");
            for (Comment comment : post.getComments()) {
                System.out.println(comment.getContent());
            }
            System.out.println("## Tags");
            for (Tag tag : post.getTags()) {
                System.out.println(tag.getName());
            }
        }
    }
}