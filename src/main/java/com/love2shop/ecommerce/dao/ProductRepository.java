package com.love2shop.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.love2shop.ecommerce.entity.Product;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200/")
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
