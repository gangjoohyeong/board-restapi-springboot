package com.restapi.board.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.restapi.board.service.articleService;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class articleController {

    private final articleService articleService;

    @GetMapping("/api/articles")
    public Map<String, Object> readAllArticle() {
        return articleService.getArticleData();
    }
}
