package com.example.storage01.repository;

import com.example.storage01.model.UserBD;
import org.springframework.data.repository.CrudRepository;

public interface UserRepos extends CrudRepository<UserBD, Long> {

}
