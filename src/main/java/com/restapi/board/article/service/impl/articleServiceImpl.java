package com.restapi.board.article.service.impl;

import com.restapi.board.article.service.articleService;
import org.springframework.stereotype.Service;
import com.restapi.board.article.repository.ArticleRepository;
import com.restapi.board.article.dto.ArticleDTO;
import com.restapi.board.article.model.Article;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class articleServiceImpl implements articleService {
    private final ArticleRepository articleRepository;

    public articleServiceImpl(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    public List<ArticleDTO> getAllArticles() {
        return articleRepository.findAll().stream().map(this::convertEntityToDto).collect(Collectors.toList());
    }

    private ArticleDTO convertEntityToDto(Article article) {
        ArticleDTO articleDto = new ArticleDTO();
        articleDto.setId(article.getId());
        articleDto.setTitle(article.getTitle());
        articleDto.setContent(article.getContent());
        articleDto.setCreateDate(article.getCreateDate());
        return articleDto;
    }

}
