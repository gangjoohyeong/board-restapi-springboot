package com.restapi.board.article.service.impl;

import com.restapi.board.article.model.Article;
import com.restapi.board.article.service.ArticleService;
import org.springframework.stereotype.Service;
import com.restapi.board.article.repository.ArticleRepository;
import com.restapi.board.article.dto.ArticleDTO;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ArticleServiceImpl implements ArticleService {
    private final ArticleRepository articleRepository;

    public ArticleServiceImpl(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    public List<ArticleDTO> getAllArticles() {
        return articleRepository
                .findAllByOrderById()
                .stream()
                .map(ArticleDTO::new)
                .collect(Collectors.toList());
    }

    public Optional<ArticleDTO> getArticleById(Long id) {
        return articleRepository
                .findById(id)
                .map(ArticleDTO::new);
    }

    public ArticleDTO createArticle(ArticleDTO articleDTO) {
        Article article = articleDTO.toEntity();
        Article savedArticle = articleRepository.save(article);
        return new ArticleDTO(savedArticle);
    }

}
