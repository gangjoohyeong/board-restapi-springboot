package com.restapi.board.article.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.restapi.board.article.service.articleService;
import org.springframework.http.ResponseEntity;

import com.restapi.board.article.dto.ArticleDTO;
import java.util.List;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class articleController {
    private final articleService articleService;

    @GetMapping("/api/articles")
    public List<ArticleDTO> getAllArticles() {
        return articleService.getAllArticles();
    }
}
