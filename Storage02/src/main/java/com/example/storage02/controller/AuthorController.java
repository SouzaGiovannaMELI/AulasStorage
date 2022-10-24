package com.example.storage02.controller;

import com.example.storage02.dto.AuthorDTO;
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

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/dto/{id}")
    public ResponseEntity<AuthorDTO> findByIdDto(@PathVariable long id){
        AuthorDTO author = service.findByIdDto(id);
        if(author != null) return ResponseEntity.ok(author);

        return ResponseEntity.notFound().build();
    }

    @GetMapping("/native/{id}")
    public ResponseEntity<Author> getNativeById(@PathVariable long id){
        Author author = service.getNativeById(id);
        if(author != null) return ResponseEntity.ok(author);

        return ResponseEntity.notFound().build();
    }

    @GetMapping("/eagle/{id}")
    public ResponseEntity<AuthorDTO> getDtoEagle(@PathVariable long id){
        AuthorDTO author = service.getDtoEagle(id);
        if(author != null) return ResponseEntity.ok(author);

        return ResponseEntity.notFound().build();
    }
}