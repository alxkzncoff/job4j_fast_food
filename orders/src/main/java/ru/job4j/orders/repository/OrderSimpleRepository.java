package ru.job4j.orders.repository;

import org.springframework.stereotype.Repository;
import ru.job4j.orders.domain.Customer;
import ru.job4j.orders.domain.Dish;
import ru.job4j.orders.domain.Order;
import ru.job4j.orders.domain.Status;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class OrderSimpleRepository {

    private final AtomicInteger id = new AtomicInteger(0);
    private final HashMap<Integer, Order> storage = new HashMap<>();

    public OrderSimpleRepository() {
        var currentId = id.incrementAndGet();
        var customer = Customer.of().username("Customer 1").build();
        var dishes = List.of(
                Dish.of().name("dish 1").price(100).build(),
                Dish.of().name("dish 2").price(150).build()
        );
        var status = Status.of().name("in process...").build();
        storage.putIfAbsent(
                currentId,
                Order.of().id(currentId).dishes(dishes).customer(customer).status(status).build()
        );
        currentId = id.incrementAndGet();
        customer = Customer.of().username("Customer 2").build();
        dishes = List.of(
                Dish.of().name("dish 3").price(100).build(),
                Dish.of().name("dish 4").price(150).build()
        );
        storage.putIfAbsent(
                currentId,
                Order.of().id(currentId).dishes(dishes).customer(customer).status(status).build()
        );
    }

    public Order save(Order order) {
        var currentId = id.incrementAndGet();
        storage.putIfAbsent(currentId, order);
        return order;
    }

    public Optional<Order> findById(int id) {
        Optional<Order> order = Optional.empty();
        if (storage.containsKey(id)) {
            order = Optional.of(storage.get(id));
        }
        return order;
    }

    public List<Order> findAll() {
        return storage.values().stream().toList();
    }

    public void delete(Order order) {
        storage.remove(order.getId());
    }
}
