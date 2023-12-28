package com.restapi.board.article.service;

import com.restapi.board.article.dto.ArticleDTO;

import java.util.List;
import java.util.Map;

public interface articleService {
    List<ArticleDTO> getAllArticles();
}
