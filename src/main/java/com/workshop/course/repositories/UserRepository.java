package com.workshop.course.repositories;

import com.workshop.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<User,Long> {

   UserDetails findByemail(String email);

}
