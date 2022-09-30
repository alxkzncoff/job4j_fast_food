package ru.job4j.delivery.domain;

import lombok.*;

/**
 * Блюдо. Можно добавлять в неограниченном количестве в заказ.
 * @author Aleksandr Kuznetsov.
 * @version 1.0
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(builderMethodName = "of")
public class Dish {

    private String name;
    private float price;
}
