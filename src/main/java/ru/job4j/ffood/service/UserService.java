package ru.job4j.ffood.service;

import ru.job4j.ffood.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User save(User user);

    Optional<User> findById(int id);

    Optional<User> findByName(String name);

    List<User> findAll();

    void delete(User user);
}
