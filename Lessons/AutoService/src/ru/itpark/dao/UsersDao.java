package ru.itpark.dao;

import ru.itpark.models.Auto;
import ru.itpark.models.User;

import java.util.ArrayList;

public interface UsersDao {
    // возвращает true, если
    // пользователь с указанным id существует
    boolean isExistById(int userId);

    ArrayList<User> findAll();
}
