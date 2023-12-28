package com.restapi.board.article.repository;

import com.restapi.board.article.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleRepository extends JpaRepository <Article, Long> {
    List<Article> findAllByOrderById();
}
