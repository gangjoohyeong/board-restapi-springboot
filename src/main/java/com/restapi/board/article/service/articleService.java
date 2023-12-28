package com.restapi.board.article.service;

import com.restapi.board.article.dto.ArticleDTO;

import java.util.List;
import java.util.Optional;

public interface articleService {
    List<ArticleDTO> getAllArticles();
    Optional<ArticleDTO> getArticleById(Long id);
}
