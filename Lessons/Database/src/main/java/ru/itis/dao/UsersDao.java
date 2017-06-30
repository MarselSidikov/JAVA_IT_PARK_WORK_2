package ru.itis.dao;

import ru.itis.models.User;

import java.util.List;

public interface UsersDao extends BaseDao<User> {
    boolean isExistById(int userId);
    List<User> findByName(String name);
    List<User> findByAge(int age);
}
