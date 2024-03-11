package com.estsoft.blogpractice.repository;

import com.estsoft.blogpractice.domain.Article;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BlogRepository {
    private final  ArticleMapper articleMapper;

    public BlogRepository(ArticleMapper articleMapper) {
        this.articleMapper = articleMapper;
    }

    public List<Article> selectAllArticle(){
        return articleMapper.selectAllArticles();
    }

    public Article selectOneArticle(Long id){
        return articleMapper.selectOneArticle(id);
    }

    public int insertOneArticle(Article article){
        return articleMapper.insertOneArticle(article);
    }
    public int updateOneArticle(Article article){
        return articleMapper.updateOneArticle(article);
    }

    public int deleteOneArticle(Long id){
        return articleMapper.deleteOneArticle(id);
    }
}