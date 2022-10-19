package ru.job4j.orders.domain;

import lombok.*;

/**
 * Статус заказа.
 * @see Order
 * @author Aleksandr Kuznetsov.
 * @version 1.0
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(builderMethodName = "of")
public class Status {

    private String name;
}
