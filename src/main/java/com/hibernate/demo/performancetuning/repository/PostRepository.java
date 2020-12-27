package com.hibernate.demo.performancetuning.repository;

import com.hibernate.demo.performancetuning.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {

    @Query("select p from Post p join fetch p.author a where p.creationDate >= :min and p.creationDate <= :max")
    List<Post> findAllByDateIntervalJoinFetchAuthor(@Param("min") LocalDateTime min, @Param("max") LocalDateTime max);

    @Query("select p from Post p where p.creationDate >= :min and p.creationDate <= :max")
    List<Post> findAllByDateInterval(@Param("min") LocalDateTime min, @Param("max") LocalDateTime max);

}
