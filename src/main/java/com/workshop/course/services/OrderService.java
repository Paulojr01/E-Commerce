package com.workshop.course.services;


import com.workshop.course.entities.Order;
import com.workshop.course.entities.User;
import com.workshop.course.repositories.OrderRepository;
import com.workshop.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll(){
        return orderRepository.findAll();
    }

    public Order findbyId(Long id){
        Optional<Order> obj = orderRepository.findById(id);
        return obj.get();
    }


}
