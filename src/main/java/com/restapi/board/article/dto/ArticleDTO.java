package com.restapi.board.article.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import com.restapi.board.article.model.Article;

@Getter
@Setter
@NoArgsConstructor
public class ArticleDTO {
    private Long id;
    private String title;
    private String content;
    private LocalDateTime createDate;

    public ArticleDTO(Article article) {
        this.id = article.getId();
        this.title = article.getTitle();
        this.content = article.getContent();
        this.createDate = article.getCreateDate();
    }

}
