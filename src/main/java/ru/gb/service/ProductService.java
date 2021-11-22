package ru.gb.service;

import ru.gb.entity.Product;

import java.util.Arrays;
import java.util.List;

public class ProductService {

    public Product createNewProduct(){
        List<Product> productList = Arrays.asList(
                new Product(1,"Milk", 10),
                new Product(2,"Banana", 5),
                new Product(3,"Butter", 17),
                new Product(4,"Oil", 50),
                new Product(5,"Tomato", 12),
                new Product(6,"Melon", 20),
                new Product(7,"Bread", 7),
                new Product(8,"Water", 10),
                new Product(9,"Sugar", 30),
                new Product(10,"Salt", 26)
        );
        return new Product(productList);
    }
}
