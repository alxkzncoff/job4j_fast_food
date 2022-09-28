package ru.job4j.ffood.service;

import ru.job4j.ffood.domain.Dish;

import java.util.List;
import java.util.Optional;

public interface DishService {

    Dish save(Dish dish);

    Optional<Dish> findById(int id);

    Optional<Dish> findByName(String name);

    List<Dish> findAll();

    void delete(Dish dish);
}
