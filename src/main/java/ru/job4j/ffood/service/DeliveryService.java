package ru.job4j.ffood.service;

import ru.job4j.ffood.domain.Delivery;
import ru.job4j.ffood.dto.LocationDTO;
import ru.job4j.ffood.domain.Order;

import java.util.List;
import java.util.Optional;

public interface DeliveryService {

    Delivery save(Delivery delivery);

    Optional<Delivery> findById(int id);

    Optional<Delivery> findByOrder(Order order);

    List<Delivery> findAllByStatus(String status);

    List<Delivery> findAll();

    void updateLocation(LocationDTO location);
}
