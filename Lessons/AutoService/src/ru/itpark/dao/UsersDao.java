package ru.itpark.dao;

public interface UsersDao {
    // возвращает true, если
    // пользователь с указанным id существует
    boolean isExistById(int userId);
}
