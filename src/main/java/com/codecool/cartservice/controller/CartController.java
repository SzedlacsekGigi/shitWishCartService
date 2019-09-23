package com.codecool.cartservice.controller;

import com.codecool.cartservice.CartService;
import com.codecool.cartservice.model.CartItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cart")
@CrossOrigin
public class CartController {

    @Autowired
    CartService cartService;

    @GetMapping("/all")
    public List<CartItem> getAllCartItems() {
        return cartService.retrieveAll();
    }
}
