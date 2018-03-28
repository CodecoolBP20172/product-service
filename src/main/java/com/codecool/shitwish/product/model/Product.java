package com.codecool.shitwish.product.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToMany(fetch=FetchType.LAZY)
    private List<Tag> listOfTags;
    private String name;
    private float price;
    private String description;

    private boolean active;

    private Long userId;

    public Product(){};

    public Product(String name, float price, String description, Long userId) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.userId = userId;
        listOfTags = new ArrayList<>();
        this.active = true;
    }

    public List<Tag> getListOfTags() {
        return listOfTags;
    }

    public void setListOfTags(List<Tag> listOfTags) {
        this.listOfTags = listOfTags;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void addTag(Tag tag){
        listOfTags.add(tag);
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

}
