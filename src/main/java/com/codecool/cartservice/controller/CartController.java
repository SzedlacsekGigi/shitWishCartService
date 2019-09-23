package com.codecool.cartservice.controller;

import com.codecool.cartservice.service.CartService;
import com.codecool.cartservice.model.CartItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @DeleteMapping("/delete/{id}")
    public void deleteCartItem(@PathVariable("id") Long id) {
        cartService.deleteCartItem(id);
    }
}
