package ru.job4j.orders.service;

import ru.job4j.orders.domain.Order;

import java.util.List;
import java.util.Optional;

public interface OrderService {

    Order save(Order order);

    Optional<Order> findById(int id);

    List<Order> findAll();

    void delete(Order order);
}
