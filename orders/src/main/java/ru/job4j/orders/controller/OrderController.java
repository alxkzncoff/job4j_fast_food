package ru.job4j.orders.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import ru.job4j.orders.domain.Order;
import ru.job4j.orders.domain.Status;
import ru.job4j.orders.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/createOrder")
    public ResponseEntity<Order> createOrder(@RequestBody Order order) {
        orderService.createOrder(order);
        return ResponseEntity.ok().body(order);
    }

    @GetMapping("/checkStatus/{orderId}")
    public ResponseEntity<Status> checkStatus(@PathVariable int orderId) {
        var order = orderService.findById(orderId).orElseThrow(() -> new ResponseStatusException(
                HttpStatus.NOT_FOUND, "Order not found."));
        var status = orderService.checkStatus(order.getId());
        return ResponseEntity.status(HttpStatus.FOUND).body(status);
    }
}
