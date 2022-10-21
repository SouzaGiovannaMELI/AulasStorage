package com.example.storage01.service;

import com.example.storage01.model.UserBD;
import com.example.storage01.repository.UserRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepos repo;

    public UserBD insert(UserBD userBD){
        return repo.save(userBD);
    }

    public Optional<UserBD> find(long cod){
        return repo.findById(cod);
    }

    public UserBD update(UserBD userBD){
        return repo.save(userBD);
    }

    public void delete(long cod){
        repo.deleteById(cod);
    }
}
