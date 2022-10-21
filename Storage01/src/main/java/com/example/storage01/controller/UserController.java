package com.example.storage01.controller;

import com.example.storage01.model.UserBD;
import com.example.storage01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping
    public ResponseEntity<UserBD> newUser(@RequestBody UserBD userBD){
        return new ResponseEntity<>(service.insert(userBD), HttpStatus.CREATED);
    }

    @GetMapping("/{cod}")
    public ResponseEntity<UserBD> getUserById(@PathVariable long cod){
        Optional<UserBD> optionalUserBD = service.find(cod);

        if(optionalUserBD.isPresent())
            return new ResponseEntity<>(service.find(cod).get(), HttpStatus.OK);

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping
    public ResponseEntity<UserBD> update(@RequestBody UserBD userBD){
        return new ResponseEntity<>(service.update(userBD), HttpStatus.OK);
    }

    @DeleteMapping("/{cod}")
    public ResponseEntity<Void> delete(@PathVariable long cod){
        service.delete(cod);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
