package com.example.storage02.service;

import com.example.storage02.model.Book;
import com.example.storage02.repository.BookRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookService implements IBookService{
    private final BookRepo repo;

    @Override
    public Book findById(long id) {
        return repo.findById(id).orElse(null);
    }
}
