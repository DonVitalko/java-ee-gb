package ru.gb.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Product {
    private int id;
    private String title;
    private int cost;
    private List<Product> list;

    public Product(List<Product> list) {
        this.list = list;
    }
    public Product(int id, String title, int cost) {
        this.id = id;
        this.title = title;
        this.cost = cost;
    }
}
