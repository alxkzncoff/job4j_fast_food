package ru.job4j.ffood.domain;

import lombok.*;
import ru.job4j.ffood.dto.LocationDTO;

import java.util.Objects;

/**
 * Доставка. Состоит из заказа и координат курьера.
 * @see Order
 * @see LocationDTO
 * @author Aleksandr Kuzncetsov.
 * @version 1.0
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(builderMethodName = "of")
public class Delivery {

    private int id;
    private Order order;
    private User user;
    private String status;
    private double longitude;
    private double latitude;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Delivery delivery = (Delivery) o;
        return id == delivery.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
