package com.restapi.board.article.model;

import java.time.LocalDateTime;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;

@Getter
@Entity
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100)
    private String title;

    @Column(columnDefinition = "TEXT")
    private String content;

    @Column(updatable = false)
    private LocalDateTime createDate;

    @Builder
    public Article(Long id, String title, String content, LocalDateTime createDate) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.createDate = createDate != null ? createDate : LocalDateTime.now();
    }

    @PrePersist
    private void onCreate() {
        if (this.createDate == null) {
            this.createDate = LocalDateTime.now();
        }
    }

    protected Article() {
    }
}
