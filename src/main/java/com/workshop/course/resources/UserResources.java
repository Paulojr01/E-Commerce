package com.workshop.course.resources;

import com.workshop.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/users", method = RequestMethod.GET)
public class UserResources {


    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L,"maria", "maria@gmail.com", "9999999", "12345");
        return ResponseEntity.ok().body(u);

    }

}
