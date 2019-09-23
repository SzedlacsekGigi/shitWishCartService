package com.codecool.cartservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CartItem {

    @Id
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private Double price;

    private String picture;

    public CartItem(Long id, String name, String picture, Double price) {
        this.id = id;
        this.name = name;
        this.picture = picture;
        this.price = price;
    }
}
