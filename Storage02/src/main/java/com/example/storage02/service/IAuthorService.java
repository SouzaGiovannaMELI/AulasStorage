package com.example.storage02.service;

import com.example.storage02.dto.AuthorDTO;
import com.example.storage02.model.Author;

public interface IAuthorService {
    Author insert(Author author);
    Author findById(long id);
    void delete(long id);
    AuthorDTO findByIdDto(long id);
    Author getNativeById(long id);
    AuthorDTO getDtoEagle(long id);
}
