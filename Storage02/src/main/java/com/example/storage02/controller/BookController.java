package com.example.storage02.controller;

import com.example.storage02.model.Book;
import com.example.storage02.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private IBookService service;

    @GetMapping("/{id}")
    public ResponseEntity<Book> findById(@PathVariable long id){
        Book book = service.findById(id);

        if(book != null)
            return ResponseEntity.ok(book);

        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
