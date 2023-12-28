package com.restapi.board.article.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import com.restapi.board.article.service.ArticleService;

import com.restapi.board.article.dto.ArticleDTO;
import java.util.List;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class ArticleController {
    private final ArticleService articleService;

    @GetMapping("/api/articles")
    public List<ArticleDTO> getAllArticles() {
        return articleService.getAllArticles();
    }

    @GetMapping("/api/articles/{id}")
    public Optional<ArticleDTO> getArticleById(@PathVariable("id") Long id) {
        return articleService.getArticleById(id);
    }

    @PostMapping("/api/articles")
    public ArticleDTO createArticle(@Validated @RequestBody ArticleDTO articleDTO) {
        return articleService.createArticle(articleDTO);
    }
}
