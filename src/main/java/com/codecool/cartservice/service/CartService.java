package com.codecool.cartservice.service;

import com.codecool.cartservice.repository.CartItemRepository;
import com.codecool.cartservice.model.CartItem;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class CartService {

    @Autowired
    CartItemRepository repository;

    public List<CartItem> retrieveAll() {
        return repository.findAll();
    }


    public void deleteCartItem(Long id) {
        CartItem deletable = repository.getOne(id);
        repository.delete(deletable);
    }
}
