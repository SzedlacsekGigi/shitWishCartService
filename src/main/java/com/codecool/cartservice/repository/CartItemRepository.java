package com.codecool.cartservice.repository;

import com.codecool.cartservice.model.CartIem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartIem, Long> {
}
