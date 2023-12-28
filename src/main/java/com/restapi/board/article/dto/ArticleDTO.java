package com.restapi.board.article.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Getter
@Setter
@NoArgsConstructor
public class ArticleDTO {
    private Integer id;
    private String title;
    private String content;
    private LocalDateTime createDate;

}
