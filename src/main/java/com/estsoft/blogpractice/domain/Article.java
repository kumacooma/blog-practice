package com.estsoft.blogpractice.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Article {

    private Long id;
    private String title;
    private String content;

    public Article(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public ArticleResponse from(){
        return new ArticleResponse(id, title, content);
    }
}
