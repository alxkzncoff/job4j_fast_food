package ru.job4j.delivery.domain;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Заказ. Состоит из блюд. Передается в доставку.
 * @author Aleksandr Kuznetsov.
 * @version 1.0
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(builderMethodName = "of")
public class Order {

    private List<Dish> dishes = new ArrayList<>();
    private User user;
}
