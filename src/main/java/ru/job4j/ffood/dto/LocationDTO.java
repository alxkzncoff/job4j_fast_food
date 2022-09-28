package ru.job4j.ffood.dto;

import lombok.*;
import ru.job4j.ffood.domain.Delivery;

import java.util.Objects;

/**
 * Координаты курьера. Отображаются при доставке.
 * @see Delivery
 * @author Aleksandr Kuznetsov.
 * @version 1.0
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(builderMethodName = "of")
public class LocationDTO {

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
        LocationDTO locationDTO = (LocationDTO) o;
        return Double.compare(locationDTO.longitude, longitude) == 0
                && Double.compare(locationDTO.latitude, latitude) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(longitude, latitude);
    }
}
