package com.example.storage03.repository;

import com.example.storage03.model.Article;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ArticleRepo extends ElasticsearchRepository<Article, Integer> {
}
