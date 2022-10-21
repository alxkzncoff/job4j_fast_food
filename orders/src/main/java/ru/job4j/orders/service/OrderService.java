package ru.job4j.orders.service;

import org.springframework.stereotype.Service;
import ru.job4j.orders.domain.Order;
import ru.job4j.orders.domain.Status;
import ru.job4j.orders.repository.OrderSimpleRepository;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    private final OrderSimpleRepository storage;

    public OrderService(OrderSimpleRepository storage) {
        this.storage = storage;
    }

    public Order createOrder(Order order) {
        return storage.save(order);
    }

    public Optional<Order> findById(int id) {
        return storage.findById(id);
    }

    public List<Order> findAll() {
        return storage.findAll();
    }

    public Status checkStatus(int orderId) {
        var status = Status.of().name("Not ordered.").build();
        var order = storage.findById(orderId);
        order.ifPresent(value -> status.setName(value.getStatus().getName()));
        return status;
    }

    public void delete(Order order) {
        if (storage.findById(order.getId()).isPresent()) {
            storage.delete(order);
        }
    }
}
