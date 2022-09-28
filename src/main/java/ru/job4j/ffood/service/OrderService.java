package ru.job4j.ffood.service;

import ru.job4j.ffood.domain.Order;
import ru.job4j.ffood.domain.User;

import java.util.List;
import java.util.Optional;

public interface OrderService {

    Order save(Order order);

    Optional<Order> findById(int id);

    List<Order> findAllByUser(User user);

    List<Order> findAll();

    void delete(Order order);
}
