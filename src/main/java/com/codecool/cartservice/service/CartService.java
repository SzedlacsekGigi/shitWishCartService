package com.codecool.cartservice.service;

import com.codecool.cartservice.repository.CartItemRepository;
import com.codecool.cartservice.model.CartItem;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

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

    public void addNewItem(Map<String, String> product) {
        Double itemPrice = Double.parseDouble(product.get("price"));
        Long itemId = Long.parseLong(product.get("id"));
        CartItem newItem = CartItem.builder()
                .price(itemPrice)
                .picture(product.get("picture"))
                .name(product.get("name"))
                .id(itemId)
                .build();

        repository.save(newItem);
    }
}
