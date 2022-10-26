package com.example.storage03.service;

import com.example.storage03.model.Article;

import java.util.List;
import java.util.Optional;

public interface IArticleService {
    Article save(Article article);
    List<Article> findAll();
    Optional<Article> findById(int id);
    String delete(int id);
    Article update(Article article);
}
