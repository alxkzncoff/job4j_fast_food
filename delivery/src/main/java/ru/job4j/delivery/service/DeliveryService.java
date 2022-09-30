package ru.job4j.delivery.service;

import ru.job4j.delivery.domain.Delivery;
import ru.job4j.delivery.dto.LocationDTO;

import java.util.List;
import java.util.Optional;

public interface DeliveryService {

    Delivery save(Delivery delivery);

    Optional<Delivery> findById(int id);

    List<Delivery> findAllByStatus(String status);

    List<Delivery> findAll();

    void updateLocation(LocationDTO location);
}
