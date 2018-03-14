package com.codecool.shitwish.product.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany
    @JoinTable(name = "product_tag",
            joinColumns = {@JoinColumn(name = "tag_id")},
            inverseJoinColumns = { @JoinColumn(name = "product_id") })
    private List<Product> products = new ArrayList<>();

    public Tag(){}

    public Tag(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }
}
