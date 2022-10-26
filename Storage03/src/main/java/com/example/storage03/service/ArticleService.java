package com.example.storage03.service;

import com.example.storage03.model.Article;
import com.example.storage03.repository.ArticleRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ArticleService implements IArticleService{
    private final ArticleRepo repo;

    @Override
    public Article save(Article article) {
        return repo.save(article);
    }

    @Override
    public List<Article> findAll() {
        return repo.findAll();
    }

    @Override
    public Optional<Article> findById(int id) {
        return repo.findById(id);
    }

    @Override
    public String delete(int id) {
        repo.deleteById(id);
        return "Deletado com sucesso";
    }

    @Override
    public Article update(Article article) {
        return repo.save(article);
    }
}
