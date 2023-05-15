package com.workshop.course.repositories;

import com.workshop.course.entities.OrderItem;
import com.workshop.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {

}
