package ru.job4j.ffood.domain;

import lombok.*;

import java.util.Objects;

/**
 * Пользователь. В зависимости от роли, пользователю доступен разный функционал сервиса.
 * @see Role
 * @author Aleksandr Kuznetsov.
 * @version 1.0
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(builderMethodName = "of")
public class User {

    private int id;
    private String username;
    private String password;
    private Role role;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return id == user.id && Objects.equals(username, user.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username);
    }
}
