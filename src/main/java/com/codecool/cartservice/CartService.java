package com.codecool.cartservice;

import com.codecool.cartservice.repository.CartItemRepository;
import com.codecool.cartservice.model.CartIem;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class CartService {

    @Autowired
    CartItemRepository repository;

    public List<CartIem> retrieveAll() {
        return repository.findAll();
    }


}
