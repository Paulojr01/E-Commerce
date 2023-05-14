package com.workshop.course.repositories;

import com.workshop.course.entities.Category;
import com.workshop.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
