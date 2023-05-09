package com.workshop.course.services;

import com.workshop.course.entities.User;
import com.workshop.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }
}
