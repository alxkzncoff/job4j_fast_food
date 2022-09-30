package ru.job4j.orders.domain;

import lombok.*;

/**
 * Пользователь.
 * @author Aleksandr Kuznetsov.
 * @version 1.0
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(builderMethodName = "of")
public class User {

    private String username;
}
