package com.restapi.board.article.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import com.restapi.board.article.model.Article;

@Getter
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

    @Builder
    public ArticleDTO(Long id, String title, String content, LocalDateTime createDate) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.createDate = createDate;
    }


    public Article toEntity() {
        return Article.builder()
                .id(id)
                .title(title)
                .content(content)
                .createDate(createDate)
                .build();
    }
}
