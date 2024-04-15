package com.dfx.manuel.controller;

import com.dfx.manuel.model.Users;
import com.dfx.manuel.repository.UserRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dfx.manuel.repository.loader;

import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin
public class UserController {
    private final UserRepository repository;

    public UserController(UserRepository repository) {
        this.repository = repository;
    }


    @GetMapping("")
   public  List<loader> getAllProduct(){
        return repository.findAll();
    }




}
