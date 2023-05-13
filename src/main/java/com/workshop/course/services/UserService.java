package com.workshop.course.services;

import com.workshop.course.entities.User;
import com.workshop.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

    public User findbyId(Long id){
        Optional<User> obj = repository.findById(id);
        return obj.get();
    }


}
