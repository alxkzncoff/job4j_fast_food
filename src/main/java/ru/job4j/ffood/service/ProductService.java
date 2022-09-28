package ru.job4j.ffood.service;

import ru.job4j.ffood.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    Product sava(Product product);

    Optional<Product> findById(int id);

    Optional<Product> findByName(String name);

    List<Product> findAll();

    void delete(Product product);
}
