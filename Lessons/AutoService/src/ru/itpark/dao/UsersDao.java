package ru.itpark.dao;

import ru.itpark.models.Auto;
import ru.itpark.models.User;

import java.util.ArrayList;
import java.util.List;

public interface UsersDao extends BaseDao<User> {
    boolean isExistById(int userId);
    List<User> findByName(String name);
    List<User> findByAge(int age);
}
