package ru.job4j.orders.domain;

import lombok.*;

/**
 * Пользователь. Оформляет заказы.
 * @see Order
 * @author Aleksandr Kuznetsov.
 * @version 1.0
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(builderMethodName = "of")
public class Customer {

    private String username;

}
