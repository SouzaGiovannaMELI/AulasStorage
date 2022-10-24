package com.example.storage02.controller;

import com.example.storage02.model.Author;
import com.example.storage02.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/author")
public class AuthorController {
    @Autowired
    private AuthorService service;

    @PostMapping
    public ResponseEntity<Author> insert(@RequestBody Author author){
        return ResponseEntity.ok(service.insert(author));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Author> findById(@PathVariable long id){
        Author author = service.findById(id);
        if(author != null) return ResponseEntity.ok(author);

        return ResponseEntity.notFound().build();
    }
}
