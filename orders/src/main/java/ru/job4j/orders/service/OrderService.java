package ru.job4j.orders.service;

import org.springframework.stereotype.Service;
import ru.job4j.orders.domain.Order;
import ru.job4j.orders.domain.Status;

import java.util.List;
import java.util.Optional;

@Service
public interface OrderService {

    Order createOrder(Order order);

    Optional<Order> findById(int id);

    List<Order> findAll();

    Status checkStatus(int orderId);

    void delete(Order order);
}
