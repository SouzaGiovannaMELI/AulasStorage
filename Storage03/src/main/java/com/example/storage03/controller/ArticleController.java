package com.example.storage03.controller;

import com.example.storage03.model.Article;
import com.example.storage03.service.IArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private IArticleService service;

    @PostMapping
    public ResponseEntity<Article> insert(@RequestBody Article article){
        return new ResponseEntity<>(service.save(article), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Article>> getAll(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Article> getById(@PathVariable int id){
        return new ResponseEntity<>(service.findById(id).get(), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Article> update(@RequestBody Article article){
        return new ResponseEntity<>(service.update(article), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable int id){
        return new ResponseEntity<>(service.delete(id), HttpStatus.OK);
    }
}
