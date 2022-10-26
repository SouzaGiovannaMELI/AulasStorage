package com.example.storage03.service;

import com.example.storage03.model.Article;
import com.example.storage03.repository.ArticleRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ArticleService implements IArticleService{
    private final ArticleRepo repo;

    @Override
    public Article save(Article article) {
        return repo.save(article);
    }
}
