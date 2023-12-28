package com.restapi.board.article.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.restapi.board.article.service.articleService;

import com.restapi.board.article.dto.ArticleDTO;
import java.util.List;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class articleController {
    private final articleService articleService;

    @GetMapping("/api/articles")
    public List<ArticleDTO> getAllArticles() {
        return articleService.getAllArticles();
    }

    @GetMapping("/api/articles/{id}")
    public Optional<ArticleDTO> getArticleById(@PathVariable("id") Long id) {
        return articleService.getArticleById(id);
    }
}
